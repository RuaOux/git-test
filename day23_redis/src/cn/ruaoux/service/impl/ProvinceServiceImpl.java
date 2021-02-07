package cn.ruaoux.service.impl;

import cn.ruaoux.dao.ProvinceDao;
import cn.ruaoux.dao.impl.ProvinceDaoImpl;
import cn.ruaoux.domain.Province;
import cn.ruaoux.service.ProvinceService;
import cn.ruaoux.test.jedis.util.JedisPoolUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {
    private ProvinceDao dao = new ProvinceDaoImpl();
    @Override
    public List<Province> findAll() {
        return dao.findAll();
    }

    /*
        使用redis缓存
     */
    @Override
    public String findAllJson() throws JsonProcessingException {
        // 1. 先从redis中查询数据
        // 1.1获取redis客户端连接
        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");

        // 2. 判断province_json 数据是否为null
        if (province_json == null || province_json.length() == 0) {
            // redis中没有数据
            System.out.println("redis中没数据：查询数据库");
            // 2.1从数据库中查询
            List<Province> ps = dao.findAll();
            // 2.2 将list序列化为json
            ObjectMapper mapper = new ObjectMapper();
            province_json = mapper.writeValueAsString(ps);

            // 2.3 将json数据存入redis中
            jedis.set("province",province_json);
            // 归还连接
            jedis.close();
        } else {
            System.out.println("redis中有数据：查询缓存...");
        }

        return province_json;
    }
}

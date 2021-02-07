package cn.ruaoux.test;

import cn.ruaoux.test.jedis.util.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
    jedis的测试鳄梨
 */
public class JedisTest {

    /*
    快速入门
     */

/*    @Test
    public void test1(){
        // 1. 获取连接
        Jedis jedis = new Jedis("localhost",6379);
        // 2. 操作
        jedis.set("username","zhangsan");
        // 3. 关闭连接
        jedis.close();
    }*/

/*    @Test
    public void test1(){
        // 1. 获取连接
        Jedis jedis = new Jedis();  //
        // 如果使用空参构造，默认值"localhost",6379端口
        // 2. 操作
        jedis.set("username","zhangsan");
        // 获取
        String username = jedis.get("username");
        System.out.println(username);

        // 可以使用sete（）方法存储可以指定过期时间的 key value
        jedis.setex("activecode",20,"hehe");
        // 将activecode，hehe键值对存入redis,并且20秒后自动删除该键值对

        // 3. 关闭连接
        jedis.close();
    }*/

/*    @Test
    public void test1(){
        // 1. 获取连接
        Jedis jedis = new Jedis();  //
        // 如果使用空参构造，默认值"localhost",6379端口
        // 2. 操作
        // 存储hash
        jedis.hset("user","name","lisi");
        jedis.hset("user","age","24");
        jedis.hset("user","gender","男");

        // 获取hash
        String name = jedis.hget("user", "name");
        // System.out.println(name);

        // 获取hash的所有map中的数据
        Map<String, String> user = jedis.hgetAll("user");
        Set<String> keySet = user.keySet();
        for (String key : keySet) {
            // 获取value
            String value = user.get(key);
            System.out.println(value);
        }

        // 3. 关闭连接
        jedis.close();
    }*/

        @Test
    public void test4(){
        // 1. 获取连接
        Jedis jedis = new Jedis();  //
        // 如果使用空参构造，默认值"localhost",6379端口
        // 2. 操作
        // list 存储
            jedis.lpush("mylist","a","b","c"); //  从左边存
            jedis.rpush("mylist","a","b","c"); //  从右边存

            // list 范围获取
            List<String> mylist = jedis.lrange("mylist", 0, -1);
            System.out.println(mylist);

            // list 弹出
            String element = jedis.lpop("mylist");
            System.out.println(element);

            String element1 = jedis.rpop("mylist");
            System.out.println(element1);

            // 3. 关闭连接
        jedis.close();
    }

    @Test
    public void test5(){
        // 1. 获取连接
        Jedis jedis = new Jedis();  //
        // 如果使用空参构造，默认值"localhost",6379端口
        // 2. 操作
        // set 存储
        jedis.sadd("myset","java","php","c++");
        // set 获取
        Set<String> myset = jedis.smembers("myset");
        System.out.println(myset);
        // 3. 关闭连接
        jedis.close();
    }

    @Test
    public void test6(){
        // 1. 获取连接
        Jedis jedis = new Jedis();  //
        // 如果使用空参构造，默认值"localhost",6379端口
        // 2. 操作
        // sortedset 存储
        jedis.zadd("mysortedset",3,"亚瑟");
        jedis.zadd("mysortedset",23,"后裔");
        jedis.zadd("mysortedset",21,"孙悟空");


        // sortedset 获取
        Set<String> mysortedset = jedis.zrange("mysortedset", 0, -1);
        System.out.println(mysortedset);


        // 3. 关闭连接
        jedis.close();
    }

    /*
        Jedis连接池使用
     */
    @Test
    public void test7 (){
        // 创建一个配置对象
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);
        config.setMaxIdle(10);

        // 创建Jedis连接池对象
        JedisPool jedisPool = new JedisPool(config,"localhost",6379);
        // 2. 获取连接
        Jedis jedis = jedisPool.getResource();
        // 3. 使用
        jedis.set("password","heihei");
        // 4. 关闭  归还到连接池中
        jedis.close();

    }
/*
    jedis连接池工具类使用
 */
    @Test
    public void test8 (){
        Jedis jedis = JedisPoolUtils.getJedis();

        jedis.set("hello","world");

        jedis.close();

    }
}

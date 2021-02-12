package com.ruaoux.dao.impl;

import com.ruaoux.dao.ItemsDao;
import com.ruaoux.domain.Items;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemsDaoImpl implements ItemsDao {


    @Override
    public List<Items> findAll() throws Exception {
        ResultSet rs = null;
        Connection con = null;
        PreparedStatement pst = null;
        List<Items> list = new ArrayList<>();
        try{
            // 加载驱动类
            Class.forName("com.mysql.jdbc.Driver");
            // 先获取contection对象
            con = DriverManager.getConnection("jdbc://bd3","root","root");
            // 获取真正操作数据库的对象
            String sql = "select * from emp";
            pst = con.prepareCall(sql);
            // 执行数据库操作
            rs = pst.executeQuery();
            // 把数据库结果集转成java的List集合
            while (rs.next()) {
                Items items = new Items();
                items.setId(rs.getInt("id"));
                items.setEname(rs.getString("name"));
                list.add(items);
            }
        } catch (Exception e) {
            System.out.printf("e");
        } finally {
            con.close();
            pst.close();
            rs.close();
        }
        return list;
    }
}

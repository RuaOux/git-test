package cn.ruaoux.com.jdbc;

import java.sql.*;

/*
    执行DDL 
 */
public class JDBCDemo07 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///bd3", "root", "root");
            // 3. 定义sql语句
            String sql = "select * from account;";
            // 4. 获取执行sql对象 Statement
            stmt = conn.createStatement();
            // 5. 执行sql
            rs = stmt.executeQuery(sql);
            // 6. 处理结果
            // 6.1  让光标向下移动一行
            while (rs.next()) {
                // 循环判断是否有数据
                // 6.2 获取数据
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble(3);
                System.out.println(id + "---" + name + "---" + balance);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            // 7. 释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}

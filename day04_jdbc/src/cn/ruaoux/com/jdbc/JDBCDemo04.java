package cn.ruaoux.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
    account表 删除一条记录
 */
public class JDBCDemo04 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///bd3", "root", "root");
            // 3. 定义sql语句
            String sql = "delete from account where id = 3;";
            // 4. 获取执行sql对象 Statement
            stmt = conn.createStatement();
            // 5. 执行sql
            int count = stmt.executeUpdate(sql);
            // 6. 处理结果
            System.out.println(count);
            if(count > 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            // 7. 释放资源
            if (stmt != null) {
                try {
                    stmt.close();
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

package com.rua.datasoure.jdbctemplate;

import com.rua.datasoure.domain.Emp;
import com.rua.datasoure.utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/*
    1. 修改1号数据的 salary 为 10000
 */
public class JdbcTemplateDemo02 {

        // Junit单元测试：可以让方法独立执行
        // 1. 获取JDBCTemplate对象private
    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Test
    public void test1(){

        // 2. 定义sql语句
        String sql = "update emp set salary = ? where id = ?";
        int count = template.update(sql, 10000, 1001);
        System.out.println(count);
    }

    @Test
    public void test2(){
        // 2. 添加一条记录
        String sql = "insert into emp(id,ename,dept_id) values(?,?,?)";
        int count = template.update(sql,1015,"郭靖",10);


         System.out.println(count);
    }
    @Test
    public void test3(){
        String sql = "delete from emp where id = ?";
        int count = template.update(sql, 1015);
        System.out.println(count);
    }
    // 4. 查询id为1001的记录，将其封装为map集合
    // 注意：这个方法的结果集只能是1
    @Test
    public void test4(){
        String sql = "select * from emp where id = ?";
        Map<String, Object> map = template.queryForMap(sql, 1001);
        System.out.println(map);
        // {id=1001, ename=孙悟空, job_id=4, mgr=1004, joindate=2000-12-17, salary=10000.00, bonus=null, dept_id=20}
    }
    //
    @Test
    public void test5(){
        String sql = "select * from emp";
        List<Map<String, Object>> list = template.queryForList(sql);
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
    }
    // 查询所有记录，将其封装为Emp对象的List集合
    @Test
    public void test6(){
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    // 7. 查询总记录数
    @Test
    public void test7(){
        String sql = "select count(id) from emp";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}

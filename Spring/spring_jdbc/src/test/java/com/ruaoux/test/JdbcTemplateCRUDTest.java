package com.ruaoux.test;

import com.ruaoux.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateCRUDTest {
    @Autowired
    private JdbcTemplate template;

    @Test
    public void test1(){
        System.out.println(template);
        String sql= "update account set money = ? where name = ? ";
        int count = template.update(sql, 50000, "ruaoux");
        System.out.println(count);
    }

    @Test
    public void testDelete(){
        String sql = "delete from account where name = ?";
        int tom = template.update(sql, "lisi");
        System.out.println(tom);
    }

    @Test
    public void testQuery(){
        String sql = "select * from account";
        List<Account> list = template.query(sql, new BeanPropertyRowMapper<Account>(Account.class));
        for (Account account : list) {
            System.out.println(account);
        }
    }

    @Test
    public void testQueryOne(){
        String sql = "select * from account where name = ?";
        Account brian = template.queryForObject(sql, new BeanPropertyRowMapper<Account>(Account.class), "brian");
        System.out.println(brian);
    }

    @Test
    public void testQueryCount(){
        String sql = "select count(*) from account";
        Integer count = template.queryForObject(sql, Integer.class);
        System.out.println(count);
    }

}

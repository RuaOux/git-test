package com.ruaoux.dao.Impl;

import com.ruaoux.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:applicationContext.xml")
@Repository("accountdao")
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public AccountDaoImpl() {
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void out(String outMan, double money) {
        String sql = "update account set money = money - ? where name = ?";
        jdbcTemplate.update(sql,money,outMan);
    }

    public void in(String inMan, double money) {
        String sql = "update account set money = money + ? where name = ?";
        jdbcTemplate.update(sql,money,inMan);
    }
}

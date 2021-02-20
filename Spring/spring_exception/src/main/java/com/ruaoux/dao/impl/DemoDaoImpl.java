package com.ruaoux.dao.impl;

import com.ruaoux.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("demoDao")
public class DemoDaoImpl implements DemoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

}

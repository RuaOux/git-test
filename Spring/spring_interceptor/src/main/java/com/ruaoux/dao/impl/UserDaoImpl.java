package com.ruaoux.dao.impl;

import com.ruaoux.dao.UserDao;
import com.ruaoux.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findAll() {
        String sql = "select * from sys_user";
        List<User> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return list;
    }

    @Override
    public User findOne(Long id) {
        User user = null;
        try {
            String sql = "select * from sys_user where id = ?";
            user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
        } catch (Exception e) {

        }
        return user;
    }

    @Override
    public Long save(final User user) {
        /*String sql = "insert into sys_user values(?,?,?,?,?)";
        jdbcTemplate.update(sql,null,user.getUsername(),user.getEmail(),user.getPassword(),user.getPhoneNum());
        */// 查询新建的用户id
        PreparedStatementCreator creator = new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                // 使用原始jdbc完成有个PreparedStatement的组件
                PreparedStatement preparedStatement = connection.prepareStatement("insert into sys_user values(?,?,?,?,?)", 1);
                preparedStatement.setObject(1,null);
                preparedStatement.setString(2,user.getUsername());
                preparedStatement.setString(3,user.getEmail());
                preparedStatement.setString(4,user.getPassword());
                preparedStatement.setString(5,user.getPhoneNum());
                return preparedStatement;
            }
        };
        // 创建keyHolder
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(creator,keyHolder);
        // 获得生成的主键
        long uId = keyHolder.getKey().longValue();
        return uId;
    }

    @Override
    public void saveUserRoleRel(Long uId, Long[] roleIds) {
        String sql = "insert into sys_user_role values (?,?)";
        for (Long roleId : roleIds) {
            jdbcTemplate.update(sql,uId,roleId);
        }
    }

    @Override
    public void delUserRoleRel(long userId) {
        // 删除关系表中的关联数据
        String sql = "delete from sys_user_role where userId = ? ";
        jdbcTemplate.update(sql,userId);
    }

    @Override
    public void del(long userId) {
        // 删除用户表中的数据
        String sql = "delete from sys_user where id = ? ";
        jdbcTemplate.update(sql,userId);
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        User user = null;
       try {
           String sql = "select * from sys_user where username = ? and password = ? ";
           user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username, password);
       } catch (Exception e) {

       }
        return user;
    }
}

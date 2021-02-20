package com.ruaoux.dao.impl;

import com.ruaoux.dao.RoleDao;
import com.ruaoux.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("roleDao")
public class RoleDaoImpl implements RoleDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Role> fingAll() {
        // 定义sql语句
        String sql = "select * from sys_role";
        List<Role> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Role>(Role.class));
        return list;
    }

    @Override
    public void save(Role role) {

        // 定义sql
        String sql = "insert into sys_role values(?,?,?)";
       jdbcTemplate.update(sql,null,role.getRoleName(),role.getRoleDesc());
    }

    @Override
    public Role findOne(Role role) {
        Role role1 = null;
        try {
            String sql = "select * from sys_role where roleName = ? and roleDesc = ? ";
            role1 = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Role>(Role.class), role.getRoleName(), role.getRoleDesc());
        } catch (Exception e) {

        }
        return role1;
    }

    @Override
    public List<Role> findByUserId(Long id) {
        // 查询关联表的对应role id
        List<Role> roles = null;
       try {
           String sql = "select * from sys_user_role ur,sys_role r where ur.roleId = r.id and ur.userId = ?";
           roles = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Role>(Role.class), id);
       } catch (Exception e) {

       }
        return roles;
    }
}

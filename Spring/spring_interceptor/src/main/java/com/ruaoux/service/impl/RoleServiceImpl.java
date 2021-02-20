package com.ruaoux.service.impl;

import com.ruaoux.dao.RoleDao;
import com.ruaoux.domain.Role;
import com.ruaoux.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> list() {
        List<Role> list = roleDao.fingAll();
        return list;
    }

    @Override
    public void save(Role role) {
        Role role1 = roleDao.findOne(role);
        if (role1 != null) {
            return;
        }
        roleDao.save(role);
    }
}

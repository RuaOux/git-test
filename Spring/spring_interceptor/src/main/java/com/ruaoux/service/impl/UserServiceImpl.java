package com.ruaoux.service.impl;

import com.ruaoux.dao.RoleDao;
import com.ruaoux.dao.UserDao;
import com.ruaoux.domain.Role;
import com.ruaoux.domain.User;
import com.ruaoux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;


    @Override
    public List<User> list() {
        // 拿到所有user的参数
        List<User> list = userDao.findAll();
        // 拿到user的role信息
        for (User user : list) {
            Long id = user.getId();
            // 将id作为参数  查询当前userid对应的Role集合数据
            List<Role> roles = roleDao.findByUserId(id);
            user.setRoles(roles);
        }


        return list;
    }

    @Override
    public void save(User user, Long[] roleIds) {
        User u = userDao.findOne(user.getId());
        Long uId = userDao.save(user);
        userDao.saveUserRoleRel(uId,roleIds);
    }

    @Override
    public void del(long userId) {
        // 1. 删除sys_user_role关系表
        userDao.delUserRoleRel(userId);
        // 2. 删除sys_user表
        userDao.del(userId);
    }

    @Override
    public User login(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username,password);
        return user;
    }
}

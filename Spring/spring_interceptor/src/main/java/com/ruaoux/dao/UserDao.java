package com.ruaoux.dao;

import com.ruaoux.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    User findOne(Long id);

    Long save(User user);

    void saveUserRoleRel(Long id, Long[] roleIds);

    void delUserRoleRel(long userId);

    void del(long userId);

    User findByUsernameAndPassword(String username, String password);
}

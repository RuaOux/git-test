package com.ruaoux.service;

import com.ruaoux.domain.User;

import java.util.List;

public interface UserService {
    List<User> list();

    void save(User user, Long[] roleIds);

    void del(long userId);

    User login(String username, String password);
}

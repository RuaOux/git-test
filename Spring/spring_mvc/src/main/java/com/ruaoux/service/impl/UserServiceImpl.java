package com.ruaoux.service.impl;

import com.ruaoux.dao.UserDao;
import com.ruaoux.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userdao;

    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }

    public void save() {

    }
}

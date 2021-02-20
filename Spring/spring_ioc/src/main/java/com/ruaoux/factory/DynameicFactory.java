package com.ruaoux.factory;

import com.ruaoux.dao.UserDao;
import com.ruaoux.dao.impl.UserDaoImpl;

public class DynameicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}

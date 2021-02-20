package com.ruaoux.mapper;

import com.ruaoux.domain.User;

import java.util.List;

public interface UserMapperc {

    public List<User> findAll();

    public List<User> findUserAndRoleAll();

}

package com.ruaoux.mapper;

import com.ruaoux.domain.User;

import java.util.List;

public interface UserMapperc {

    public void save(User user);

    public User findById(int id);

    public List<User> findAll();

}

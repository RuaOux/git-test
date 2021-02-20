package com.ruaoux.dao;

import com.ruaoux.domain.User;

import java.io.IOException;
import java.util.List;

public interface UserMapper {
    public List<User> findAll() throws IOException;

    public User findById(int id) throws IOException;
}

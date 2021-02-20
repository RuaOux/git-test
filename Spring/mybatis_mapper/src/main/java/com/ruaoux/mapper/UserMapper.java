package com.ruaoux.mapper;

import com.ruaoux.domain.User;

import java.util.List;

public interface UserMapperc {

    public List<User> findByCondition(User user);

    public List<User> findByIds(List<Integer> ids);
}

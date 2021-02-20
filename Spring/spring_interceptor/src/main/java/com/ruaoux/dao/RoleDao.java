package com.ruaoux.dao;

import com.ruaoux.domain.Role;

import java.util.List;

public interface RoleDao {
    List<Role> fingAll();

    void save(Role role);

    Role findOne(Role role);

    List<Role> findByUserId(Long id);
}

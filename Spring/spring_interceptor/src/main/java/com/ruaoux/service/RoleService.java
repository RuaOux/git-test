package com.ruaoux.service;

import com.ruaoux.domain.Role;

import java.util.List;

public interface RoleService {
    List<Role> list();

    void save(Role role);
}

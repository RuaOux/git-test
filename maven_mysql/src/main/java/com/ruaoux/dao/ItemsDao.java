package com.ruaoux.dao;

import com.ruaoux.domain.Items;

import java.sql.SQLException;
import java.util.List;

public interface ItemsDao {
    public List<Items> findAll() throws Exception;
}

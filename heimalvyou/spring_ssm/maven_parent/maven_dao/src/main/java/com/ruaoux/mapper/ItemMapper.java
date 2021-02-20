package com.ruaoux.mapper;


import com.ruaoux.pojo.Item;
import org.apache.ibatis.annotations.Mapper;

public interface ItemMapper {

    public Item findById(int id);

}

package com.ruaoux.mapper;

import com.ruaoux.domain.Order;
import com.ruaoux.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Insert(" insert into user values(#{id},#{name},#{password},#{birthday})")
    public void save(User user);

    @Update("update user set name = #{name},password = #{password} where id = #{id}")
    public void update(User user);

    @Delete("delete from user where id = #{id}")
    public void delete(int id);

    @Select("select * from user where  id = #{id}")
    public User findById(int id);

    @Select("select * from user")
    public List<User> findAll();

    @Select("select * from user")
    @Results({
            @Result(id =true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "password",property = "password"),
            @Result(column = "birthday",property = "birthday"),
            @Result(
                    property = "orderList",
                    column = "id",
                    javaType = List.class,
                    many = @Many(select = "com.ruaoux.mapper.OrderMapper.findByUid")
            )})
    public List<User> findUserAndOrederAll();

    @Select("select * from user")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(id = true,column = "name",property = "name"),
            @Result(id = true,column = "password",property = "password"),
            @Result(
                    property = "roleList",
                    column = "id",
                    javaType = List.class,
                    many = @Many(select = "com.ruaoux.mapper.RoleMapper.findByrId")
            )
    })
    public List<User> findUserAndRoleAll();

}

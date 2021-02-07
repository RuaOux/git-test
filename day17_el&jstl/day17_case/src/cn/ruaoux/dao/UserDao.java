package cn.ruaoux.dao;

import cn.ruaoux.domain.User;

import java.util.List;
import java.util.Map;

/*
    用户操作的Dao
 */
public interface UserDao {
    public List<User> findAll();

    public User findUserByUsernameAndPassword(String username,String password);

    void add(User user);

    void delete(int id);

    User findById(int parseInt);

    void update(User user);

    /*
        分页查询每页记录
     */
    List<User> findByPage(int start, int rows, Map<String, String[]> condition);

    /*
         查询条件总记录数
         */
    int totalCount(Map<String, String[]> condition);
}

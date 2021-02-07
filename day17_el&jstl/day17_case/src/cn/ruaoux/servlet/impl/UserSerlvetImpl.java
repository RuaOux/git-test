package cn.ruaoux.servlet.impl;

import cn.ruaoux.dao.UserDao;
import cn.ruaoux.dao.impl.UserDaoImpl;
import cn.ruaoux.domain.PageBean;
import cn.ruaoux.domain.User;
import cn.ruaoux.servlet.UserSerlvet;

import java.util.List;
import java.util.Map;

public class UserSerlvetImpl implements UserSerlvet {
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        // 调用Dao完成查询
        return dao.findAll();
    }

    @Override
    public User login(User user) {
        return dao.findUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public void addUser(User user) {
        dao.add(user);
    }

    @Override
    public void deleteUesr(String id) {
        dao.delete(Integer.parseInt(id));
    }

    @Override
    public User findUserByid(String id) {
        return dao.findById(Integer.parseInt(id));
    }

    @Override
    public void updateUser(User user) {
        dao.update(user);
    }

    @Override
    public void delSelectedUser(String[] ids) {
        // 1. 遍历数组
        for (String id : ids) {
            // 2. 调用dao删除
            dao.delete(Integer.parseInt(id));
        }
    }

    public PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition) {



        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);
        if (currentPage <= 0) {
            currentPage = 1;
        }

        // 1. 创建空的PageBean对象
        PageBean<User> pb = new PageBean<>();
        // 2. 设置参数
        pb.setCurrentPage(currentPage);
        pb.setRows(rows);

        // 3. 调用dao查询totalCount总记录数
        int totalCount = dao.totalCount(condition);
        pb.setTotalCount(totalCount);
        // 4. 调用dao查询List集合
        // 计算开始的记录索引
        int start = (currentPage - 1) * rows;
        List<User> list =  dao.findByPage(start,rows,condition);
        pb.setList(list);
        // 5. 计算总页码
        int totalPage = (totalCount % rows) == 0  ? (totalCount / rows) : (totalCount / rows) + 1;
        pb.setTotalPage(totalPage);
        
        return pb;
    }
}


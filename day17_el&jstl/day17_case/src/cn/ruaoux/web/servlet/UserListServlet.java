package cn.ruaoux.web.servlet;

import cn.ruaoux.domain.User;
import cn.ruaoux.servlet.UserSerlvet;
import cn.ruaoux.servlet.impl.UserSerlvetImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/userListServlet")
public class UserListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 调用UserServlet完成查询
        UserSerlvet servlet = new UserSerlvetImpl();
        List<User> users = servlet.findAll();
        // 2. 将list存入request域
        request.setAttribute("users",users);
        // 3. 转发到list.jsp
        request.getRequestDispatcher("/list.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}

package cn.ruaoux.web.servlet;

import cn.ruaoux.servlet.impl.UserSerlvetImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delSerlectedServlet")
public class DelSerlectedServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 获取所有的id
        String[] ids = request.getParameterValues("uid");

        // 2. 调用service删除
        UserSerlvetImpl service = new UserSerlvetImpl();
        service.delSelectedUser(ids);

        // 3. 跳转查询所有的Servlet
        response.sendRedirect(request.getContextPath()+"/userListServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}

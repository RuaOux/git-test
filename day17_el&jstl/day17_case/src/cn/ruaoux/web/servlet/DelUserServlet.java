package cn.ruaoux.web.servlet;

import cn.ruaoux.servlet.UserSerlvet;
import cn.ruaoux.servlet.impl.UserSerlvetImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delUserServlet")
public class DelUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 获取id
        String id = request.getParameter("id");
        // 2. 调用service删除
        UserSerlvet service = new UserSerlvetImpl();
        service.deleteUesr(id);
        // 3. 跳转到查询所有的Servlet
        response.sendRedirect(request.getContextPath() + "/userListServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}

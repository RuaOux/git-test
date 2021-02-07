package cn.ruaoux.web.servlet;

import cn.ruaoux.domain.User;
import cn.ruaoux.servlet.impl.UserSerlvetImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 设置编码
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        // 2. 调用Service查询
        UserSerlvetImpl service = new UserSerlvetImpl();
        User user = service.findUserByid(id);

        // 3. 将user 存入request
        request.setAttribute("user",user);
        // 4. 转发到update.jsp
        request.getRequestDispatcher("/update.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}

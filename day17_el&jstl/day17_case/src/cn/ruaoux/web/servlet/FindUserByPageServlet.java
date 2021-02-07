package cn.ruaoux.web.servlet;

import cn.ruaoux.domain.PageBean;
import cn.ruaoux.domain.User;
import cn.ruaoux.servlet.impl.UserSerlvetImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/findUserByPageServlet")
public class FindUserByPageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        // 接受请求参数
        String currentPage = request.getParameter("currentPage");  // 当前页码
        String rows = request.getParameter("rows");  // 每页显示条数
        if (currentPage == null || "".equals(currentPage) ) {

            currentPage = "1";
        }
        if (rows == null || "".equals(rows)) {
            rows = "5";
        }

        // 获取条件查询的参数
        Map<String, String[]> condition = request.getParameterMap();


        // 调用Service查询 PageBean
        UserSerlvetImpl service = new UserSerlvetImpl();
        PageBean<User> pb = service.findUserByPage(currentPage,rows,condition);

        // 将PageBean存入request
        request.setAttribute("pb",pb);
        request.setAttribute("condition",condition); // 将查询条件存入request

        // 转发list.jsp展示
        request.getRequestDispatcher("/list.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}

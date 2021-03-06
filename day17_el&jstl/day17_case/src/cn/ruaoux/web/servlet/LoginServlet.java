package cn.ruaoux.web.servlet;

import cn.ruaoux.dao.UserDao;
import cn.ruaoux.domain.User;
import cn.ruaoux.servlet.impl.UserSerlvetImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 设置编码
        request.setCharacterEncoding("utf-8");
        // 2. 获取数据
        // 2.1 获取用户填写的验证码
        String verifycode = request.getParameter("verifycode");
        Map<String, String[]> map = request.getParameterMap();

        // 2.2 验证码校验
        HttpSession session = request.getSession();
        String checkcode_server = (String)session.getAttribute("CHECKCODE_SERVER");
        session.removeAttribute("CHECKCODE_SERVER"); // 确保验证码一次性
        if (checkcode_server != null && checkcode_server.equalsIgnoreCase(verifycode)) {
            // 验证码正确
            // 3. 封装User对象
            User user = new User();
            try {
                BeanUtils.populate(user,map);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

            // 4. 调用Service查询
            UserSerlvetImpl serivce = new UserSerlvetImpl();
            User loginUser = serivce.login(user);

            // 5. 判断是否登录成功
            if (loginUser != null){
                // 登录成功
                // 将用户存入session
                session.setAttribute("user",loginUser);
                // 跳转页面
                response.sendRedirect(request.getContextPath()+"/index.jsp");
            } else {
                // 登录失败
                request.setAttribute("login_msg","用户名或密码错误！");
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            }
        } else {
            // 验证码不正确
            // 提示信息
            request.setAttribute("login_msg","验证码错误！");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}

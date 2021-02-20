package com.ruaoux.interceptor;

import com.ruaoux.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class PrivilegeInterceptor implements HandlerInterceptor {
    @Override
    // 在目标方法执行之前 执行
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            // 用户没有登录
            response.sendRedirect(request.getContextPath() + "/login.jsp");
            return false;
        }

        // 放行 访问目标资源
        return true;
    }
}

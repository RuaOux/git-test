package cn.rua.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
    演示Request对象获取请求行数据
 */
@WebServlet("/requesrDemo1")
public class RequesrDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    /*

		1. 获取请求行数据
		   * GET /day14/demo1?name=zhangsan HTTP/1.1
		   * 方法：
		     1. 获取请求方式：GET
			String getMethod（）
		     2. （*）获取虚拟目录：/day14
			String getContextPath（）
		     3. 获取Servlet路径：/demo1
			String getServletPath（）
		     4. 获取get方式请求参数：name=zhangsan
			String getQueryString（）
		     5. （*）获取请求URI：/day14/demo1
			String getRequestURI（）：/day14/demo1
			String getRequestURL（）：http://localhost/day14/demo1
		     6. 获取协议及版本：HTTP/1.1
			String getProtocol（）
		     7. 获取客户机的IP地址：
			String getRemoteAddr（）
     */
        // 1. 获取请求方式：GET
        String method = request.getMethod();
        System.out.println(method);
        // 2. （*）获取虚拟目录：/day14
        String cp = request.getContextPath();
        System.out.println(cp);
        // 3. 获取Servlet路径：/requesrDemo1
        String sp = request.getServletPath();
        System.out.println(sp);
        // 4. 获取get方式请求参数：name=zhangsan
        String qs = request.getQueryString();
        System.out.println(qs);
        // 5. （*）获取请求URI：/day14//requesrDemo1
        String ruri = request.getRequestURI();
        System.out.println(ruri);  // /day14//requesrDemo1
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURL);  // http://localhost/day14//requesrDemo1
        // 6. 获取协议及版本：HTTP/1.1
        String protocol = request.getProtocol();
        System.out.println(protocol);
        // 7. 获取客户机的IP地址：
        String radd = request.getRemoteAddr();
        System.out.println(radd);
    }
}

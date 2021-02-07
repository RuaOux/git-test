<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el隐式对象</title>
</head>
<body>
<%
    response.sendRedirect(request.getContextPath());
%>
${pageContext.request}<br>
<h4>动态获取虚拟目录</h4>
${pageContext.request.contextPath}
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>success</h1>
<form action="${pageContext.request.contextPath}/quick14" method="post">
    <input type="text" name="name">
    <input type="submit" value="提交">
</form>

<form action="${pageContext.request.contextPath}/quick20"
      method="post" enctype="application/x-www-form-urlencoded">
    名称：<input type="text" name="name"><br>
    文件1：<input type="file" name="uploadFile1"><br>
    文件2：<input type="file" name="uploadFile2"><br>
    <input type="submit" value="提交"><br>
</form>
</body>
</html>

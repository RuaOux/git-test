<%@ page import="cn.ruaoux.domain.User" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取数据</title>
</head>
<body>
<%
    User user = new User();
    user.setName("张三");
    user.setAge(23);
    user.setBirthday(new Date());


    request.setAttribute("u",user);
    List list = new ArrayList();
    list.add("aaa");
    list.add("bbbb");
    list.add(user);
    request.setAttribute("list",list);

    HashMap map = new HashMap();
    map.put("sname","李四");
    map.put("gender","男");
    map.put("user",user);
    request.setAttribute("map",map);


%>
<h3>el获取对象中的值</h3>
${requestScope.u}
${requestScope.u.name}<br>
${requestScope.u.age}<br>
${requestScope.u.birthday}<br>
${u.birthday.month}<br>
${u.birStr}<br>

<h3>el获取list的值</h3>
${list}<br>
${list[0]}<br>
${list[1]}<br>
${list[21]}<br>
${list[2].name}<br>
${list[2].birStr}<br>

<h3>el获取Map的值/h3><br>
    ${map}<br>
    ${map.gender}<br>
    ${map["gender"]}<br>
    ${map.sname}<br>
    ${map.user.name}

<%--
    * 通过的是对象的属性来获取
        * setter或getter方法，去掉set或get，在将省部分，首字母变为小写
        * setName -> Name -> name
--%>


</body>
</html>

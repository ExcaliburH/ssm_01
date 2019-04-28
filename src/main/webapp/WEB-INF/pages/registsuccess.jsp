<%--
  Created by IntelliJ IDEA.
  User: 82361
  Date: 2019/4/25
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>

    <style type="text/css">
        .pages{
            text-align: center;
            margin-top: 200px;
        }
    </style>

</head>
<body>
<%
    String name = request.getParameter("username");

    session.setAttribute("username", name);
    String names = (String) session.getAttribute("username");
%>
<div class="pages">
    <h3>注册成功</h3>
    欢迎您:<%=names%>！
    <a href="/commodity/findAll/0">进入菜单</a>
</div>

</body>
</html>

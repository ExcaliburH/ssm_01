<%--
  Created by IntelliJ IDEA.
  User: 82361
  Date: 2019/4/23
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <style type="text/css">
        .pages{
            text-align: center;
            margin-top: 200px;
        }
    </style>
</head>
<body>

<div class="pages">
    <form action="/account/find" method="post">
        用户名：<input type="text" name="username" placeholder="用户名" /><br/>
        密码：<input type="password" name="password" placeholder="密码"/><br/>

        <input type="submit" value="登录" /><br/>
    </form>
    <a href="/account/regist">注册</a>
</div>

</body>
</html>

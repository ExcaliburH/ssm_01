<%--
  Created by IntelliJ IDEA.
  User: 82361
  Date: 2019/4/25
  Time: 16:00
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
    <form action="/account/save" method="post">
        用户id：<input type="text" name="userid" /><br/>
        用户名：<input type="text" name="username" /><br/>
        密码：<input type="password" name="password" /><br/>
        昵称：<input type="text" name="uname" /><br/>
        年龄：<input type="text" name="age" /><br/>

        <input type="submit" value="注册" /><br/>
    </form>
</div>
</body>
</html>

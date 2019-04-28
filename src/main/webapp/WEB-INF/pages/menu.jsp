<%--
  Created by IntelliJ IDEA.
  User: 82361
  Date: 2019/4/23
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <title>Title</title>

    <style type="text/css">
        .pages{
            text-align: center;
            margin-top: 50px;
        }
        .pages a,.pages span{
            text-decoration: none;
            border:1px solid #f9d52b;
            padding: 5px 7px;
            color: #767675;
            cursor: pointer;
        }
        .pages a:hover,.pages span:hover{
            color: red;
        }
    </style>
</head>
<body>
<div class="pages">

<form action="/commodity/findName" method="post">
    商品名：<input type="text" name="commodityname" />

    <input type="submit" value="查询" />
</form>
<form action="/commodity/findPrice" method="post">
    价格：<input type="text" name="price" />

    <input type="submit" value="查询" />
</form>

<table align="center">
    <tr>
        <td>commodityid</td>
        <td>commodityname</td>
        <td>price</td>
    </tr>
    <c:forEach items="${menu}" var="commodity">

        <tr>
            <td>${commodity.commodityid}</td>
            <td>${commodity.commodityname}</td>
            <td>${commodity.price}</td>
            <%--<td>${commodity.descriptions}</td>--%>
            <%--<td>${commodity.place}</td>--%>
        </tr>

    </c:forEach>
</table>

    <a href="/commodity/findAll/0">1</a>
    <a href="/commodity/findAll/1">2</a>
    <a href="/commodity/findAll/2">3</a>


</div>

</body>
</html>

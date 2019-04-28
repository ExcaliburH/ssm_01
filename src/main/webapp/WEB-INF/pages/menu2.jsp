<%--
  Created by IntelliJ IDEA.
  User: 82361
  Date: 2019/4/24
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <title>Title</title>

    <style type="text/css">
        .page{
            text-align: center;
            margin-top: 70px;
        }
        .page a,.page span{
            text-decoration: none;
            border:1px solid #f9d52b;
            padding: 5px 7px;
            color: #767675;
            cursor: pointer;
        }
        .page a:hover,.page span:hover{
            color: red;
        }
    </style>
</head>
<body>

<%--<form action="/commodity/findName" method="post">--%>
    <%--商品名：<input type="text" name="commodityname" />--%>
    <%--价格：<input type="text" name="price" />--%>

    <%--<input type="submit" value="查询" /><br/>--%>
<%--</form>--%>

<table align="center">
    <tr>
        <td>commodityid</td>
        <td>commodityname</td>
        <td>price</td>
        <td>descriptions</td>
        <td>place</td>
    </tr>
    <c:forEach items="${menu2}" var="commodity">

        <tr>
            <td>${commodity.commodityid}</td>
            <td>${commodity.commodityname}</td>
            <td>${commodity.price}</td>
            <td>${commodity.descriptions}</td>
            <td>${commodity.place}</td>
        </tr>

    </c:forEach>
</table>
<div class="page">

    <tr></tr>
    <a href="/commodity/findAll/0">返回</a>

</div>

</body>
</html>

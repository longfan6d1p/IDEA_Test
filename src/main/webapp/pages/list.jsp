<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/2 0002
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>列表页</title>
</head>
<body>
<h1>账户列表~</h1>
<table border="1">
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>金额</td>
    </tr>
    <c:forEach items="${list}" var="account">
    <tr>
        <td>${account.id}</td>
        <td>${account.name}</td>
        <td>${account.money}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>

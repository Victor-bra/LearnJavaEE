<%@ page import="logic.Cart" %><%--
  Created by IntelliJ IDEA.
  User: super
  Date: 02.09.2021
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ShowCart</title>
</head>
<body>
    <% Cart cart = (Cart) session.getAttribute("cart"); %>
    <p>Наименование: <%= cart.getName()%></p>
    <p>Количество: <%= cart.getQuentity()%></p>

</body>
</html>

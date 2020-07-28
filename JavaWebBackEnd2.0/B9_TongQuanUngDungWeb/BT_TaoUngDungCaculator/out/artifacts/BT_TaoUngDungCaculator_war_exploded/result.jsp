<%--
  Created by IntelliJ IDEA.
  User: pato2
  Date: 03/29/20
  Time: 1:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" href="calculator.css">
</head>
<body>
<div class="boardCal">
    <h1 style="color: blue">Product Discount Calculator</h1><br>
    <label>Product Description:</label>
    <%=request.getParameter("productDescription")%><br>
    <label>Price:</label>
    $<span><%=request.getParameter("listPrice")%></span><br>
    <label>Discount Percent:</label>
    <span><%=request.getParameter("discountPercent")%>%</span><br>
    <label>Discount Amount:</label>
    $<span><%=request.getAttribute("result")%></span><br>
    <label>Discount Price:</label>
    $<span><%=request.getAttribute("discountPrice")%></span><br>
</div>
</body>
</html>
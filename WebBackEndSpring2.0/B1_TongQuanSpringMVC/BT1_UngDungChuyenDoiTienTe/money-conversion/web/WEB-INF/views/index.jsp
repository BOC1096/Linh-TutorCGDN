<%--
  Created by IntelliJ IDEA.
  User: pato2
  Date: 04/02/20
  Time: 9:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Money Conversion</title>
</head>
<body>
<form action="/calculate" method="post">
    <label>Rate: </label><br>
    <input type="text" name="rate" value="${modelConversion.rate}"/><br>
    <label>USD: </label><br>
    <input type="text" name="usd" value="${modelConversion.usd}"/><br>
    <label>VND: </label><br>
    <input type="text" name="vnd" value="${modelConversion.vnd}" readonly/><br>
    <input type="submit" value="Calculate"/>
</form>
</body>
</html>

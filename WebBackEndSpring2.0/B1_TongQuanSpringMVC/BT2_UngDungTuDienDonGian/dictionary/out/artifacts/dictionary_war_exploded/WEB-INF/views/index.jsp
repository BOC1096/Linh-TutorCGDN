<%--
  Created by IntelliJ IDEA.
  User: pato2
  Date: 04/02/20
  Time: 10:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form action="/translate" method="post">
    <label>English: </label><br>
    <input type="text" name="english" value="${modelTranslator.english}"/><br>
    <label>Vietnamese: </label><br>
    <input type="text" name="vietnamese" value="${modelTranslator.vietnamese}" readonly/><br>
    <input type="submit" value="Translate"/>
</form>
</body>
</html>

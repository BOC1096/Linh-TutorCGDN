<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
</head>
<body>
<div style="text-align: center;">
    <h1>User Management</h1>
    <h2>
        <a href="/noteTypes">List All NoteType</a>
    </h2>
</div>
<div align="center">
    <form method="post" action="/noteTypes?action=edit">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New NoteType</h2>
            </caption>
            <tr>
                <th>NoteType Name:</th>
                <td>
                    <c:if test="${noteType != null}">
                        <input type="hidden" name="id" value="<c:out value='${noteType.id}'/>">
                    <input type="text" name="name" id="name" size="45" value="<c:out value='${noteType.name}' />"/>
                    </c:if>
                </td>
            </tr>
            <tr>
                <th>Description:</th>
                <td>
                    <textarea name="description"><c:out value="${noteType.description}"/></textarea>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
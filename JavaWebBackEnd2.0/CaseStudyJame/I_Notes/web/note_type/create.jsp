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
    <form method="post" action="/noteTypes?action=create">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New NoteType</h2>
            </caption>
            <tr>
                <th>NoteType Name:</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Description:</th>
                <td>
                    <textarea name="description"></textarea>
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
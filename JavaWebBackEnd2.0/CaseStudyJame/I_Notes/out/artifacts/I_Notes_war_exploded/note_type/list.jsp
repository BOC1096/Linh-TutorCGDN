<%--
  Created by IntelliJ IDEA.
  User: Trung
  Date: 3/18/2020
  Time: 3:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Management Application</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css"
          href="http://www.shieldui.com/shared/components/latest/css/light-bootstrap/all.min.css"/>
    <script type="text/javascript"
            src="http://www.shieldui.com/shared/components/latest/js/shieldui-all.min.js"></script>
</head>
<body>
<header>
    <nav class="navbar navbar-expand-md bg-dark navbar-dark">
        <!-- Brand -->
        <a class="navbar-brand" href="#">Quản lí Notes</a>

        <!-- Toggler/collapsibe Button -->
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>

        <!-- Navbar links -->
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="/noteTypes">Type Note</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/notes">Note</a>
                </li>
            </ul>
        </div>
        <form class="form-inline">
            <input class="form-control mr-sm-2" name="search" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </nav>
</header>
<div style="text-align: center;">
    <h1>Note Type Management</h1>
    <h2><a href="/noteTypes?action=create">Add New NoteType</a></h2>
</div>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of NoteType</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="note_type" items="${listNoteType}">
            <tr>
                <td><c:out value="${note_type.id}"/></td>
                <td><c:out value="${note_type.name}"/></td>
                <td><c:out value="${note_type.description}"/></td>
                <td>
                    <a href="/noteTypes?action=edit&id=${note_type.id}">Edit</a>
                </td>
                <td><a href="/noteTypes?action=delete&id=${note_type.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>

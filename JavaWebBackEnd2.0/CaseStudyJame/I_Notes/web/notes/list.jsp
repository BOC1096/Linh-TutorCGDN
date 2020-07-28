<%--
  Created by IntelliJ IDEA.
  User: Trung
  Date: 3/18/2020
  Time: 3:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách Note</title>
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
<body>
<div class="container">
    <center>
        <h2>Danh sách Note</h2>
    </center>
    <div class="row form-group">
        <button class="btn btn-lg " style="background-color:transparent;"
                onclick="location.href='/notes?action=create';">
            <i class="fa fa-plus-square"></i> Thêm mới Note
        </button>
    </div>
    <table class="table">
        <thead class="thead-light">
        <tr class="row">
            <th class="col-md-2 ">Title</th>
            <th class="col-md-6 ">Content</th>
            <th class="col-md-2 ">Type note</th>
            <th class="col-md-2">Chức năng</th>

        </tr>
        </thead>
        <c:forEach items='${listNotes}' var="note">
            <tr class="row">
                <td class="col-md-2 "><a href="/notes?action=viewNote&id=${note.getId()}">${note.getTitle()}</a></td>
                <td class="col-md-6 ">${note.getContent()}</td>
                <td class="col-md-2 ">${note.getNoteType().getName()}</td>
                <td class="col-md-2">
                    <button class="btn btn-lg" style="background-color:transparent;"
                            onclick="location.href='/notes?action=edit&id=${note.getId()}';">
                        <i class="fa fa-edit"></i>
                    </button>
                    <button class="btn btn-lg" style="background-color:transparent;"
                            onclick="location.href='/notes?action=delete&id=${note.getId()}';">
                        <i class="fa fa-trash"></i>
                    </button>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
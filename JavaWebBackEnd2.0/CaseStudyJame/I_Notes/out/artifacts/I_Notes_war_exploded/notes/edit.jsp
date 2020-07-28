<%--
  Created by IntelliJ IDEA.
  User: Trung
  Date: 3/18/2020
  Time: 11:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm mới Note</title>
    <style>
        fieldset.scheduler-border {
            border: 1px groove #ddd !important;
            padding: 0 1.4em 1.4em 1.4em !important;
            margin: 0 0 1.5em 0 !important;
            -webkit-box-shadow: 0px 0px 0px 0px #000;
            box-shadow: 0px 0px 0px 0px #000;
            background-color: #dddddd;
        }

        legend.scheduler-border {
            width: inherit; /* Or auto */
            padding: 0 10px; /* To give a bit of padding on the left and right */
            border-bottom: none;
        }
    </style>
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
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </nav>
</header>
<body>
<div class="container d-flex justify-content-center align-items-center">
    <div class="col-md-8">
        <h2 class="form-group">Thêm mới Note</h2>
        <form method="post">
            <fieldset class="scheduler-border">
                <legend class="scheduler-border">Thông tin của Note</legend>
                <div class="row">
                    <div class="col-md-3"></div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <input type="hidden" name="id" value="<c:out value='${note.id}'/>">
                            <label class="control-label input-label" for="inputTitle">Title :</label>
                            <input type="text" class="form-control" value="<c:out value='${note.title}'/>" id="inputTitle" name="title" title="title"/>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3"></div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label class="control-label input-label" for="inputContent">Content :</label>
                            <textarea type="text" class="form-control" name="content" id="inputContent"
                                      title="Content"><c:out value="${note.content}"/></textarea>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3"></div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label class="control-label input-label" for="inputTypeNote">Type note:</label>
                            <select title="typeNoteId" id="inputTypeNote" class="form-control" name="type_id">
                                <c:forEach items="${noteTypes}" var="noteType">
                                    <option value="${noteType.getId()}">${noteType.getName()}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3"></div>
                    <div class="col-md-3">
                        <div class="form-group">
                            <input type="submit" class="btn btn-primary" value="Thêm mới">
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="form-group">
                            <input type="reset" class="btn btn-warning" value="Reset">
                        </div>
                    </div>
                </div>
            </fieldset>
        </form>
    </div>

</div>
</body>
</html>

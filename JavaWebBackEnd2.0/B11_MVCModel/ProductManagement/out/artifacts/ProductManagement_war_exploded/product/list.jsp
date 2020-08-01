<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
    <h1>Products</h1>
    <p>
        <a href="/products?action=create">Create new product</a>
    </p>
    <form action="/products">
        <input type="hidden" name="action" value="search" />
        <input type="text" name="keyword" />
        <input type="submit" value="Search" />
        <table border="1">
            <tr>
                <td>Name</td>
                <td>Amount Number</td>
                <td>Edit</td>
                <td>Delete</td>
            </tr>
            <c:forEach items='${requestScope["products"]}' var="product">
                <tr>
                    <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
                    <td>${product.getAmountNumber()}</td>
                    <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
                    <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </form>
</body>
</html>
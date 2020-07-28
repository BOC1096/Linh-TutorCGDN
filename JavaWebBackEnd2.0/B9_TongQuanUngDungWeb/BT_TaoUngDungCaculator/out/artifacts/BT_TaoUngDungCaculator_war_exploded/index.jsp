<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 7/28/2020
  Time: 11:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <div class="boardCal">
    <form action="/calculate" method="post">
      <h1 style="color: blue">Product Discount Calculator</h1><br>
      <label>Product Description:</label>
      <input type="text" name="productDescription" /><br>
      <label>List Price:</label>
      <input type="text" name="listPrice" /><br>
      <label>Discount Percent:</label>
      <input type="text" name="discountPercent" />(%)<br>
      <label>&nbsp;</label>
      <input type="submit" value="Calculate Discount" />
    </form>
  </div>
  </body>
</html>

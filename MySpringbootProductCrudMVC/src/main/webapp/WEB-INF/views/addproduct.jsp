<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add-Product</title>
</head>
<body>
<div align="center">
<h2>Add Product</h2>
   <form action="insertProduct" method="post">
       <input type="text" name="pid" id="pid" placeholder="Product ID"><br>
       <input type="text" name="pname" id="pname" placeholder="Product Name"><br>
       <input type="text" name="qty" id="qty" placeholder="Quantity"><br>
       <input type="text" name="price" id="price" placeholder="Price"><br><br>
       <button type="submit" name="btn" id="btn">Add new Product</button>
   </form>
  </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
   <form action="/product/updateProduct" method="post">
       Product_ID : <input type="text" name="pid" id="pid" value="${p.pid}" readonly><br>
       Product Name : <input type="text" name="pname" id="pname" value="${p.pname}"><br>
       Quantity : <input type="text" name="qty" id="qty" value="${p.qty}"><br>
       Price : <input type="text" name="price" id="price" value="${p.price}"><br><br>
       <button type="submit" name="btn" id="btn">update Product</button>
   </form>
   </div>
</body>
</html>
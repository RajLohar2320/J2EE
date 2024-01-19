<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body>
<div align="center">
	<h2>Update Product</h2>
	<form action="/Spring_MVC_CRUD/product/updateProduct" method="POST">
		Prod_ID <input type="text" name="pid" id="pid" value="${p.pid}" readonly>
		Prod_DECS <input type="text" name="desc" id="desc" value="${p.desc}"><br><br>
		<button type="submit" name="btn" id="btn">Update</button>
		<button type="reset" name="btn" id="btn">Clear</button>
	</form>
</div>
</body>
</html>
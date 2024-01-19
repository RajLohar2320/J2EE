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
	<h2>Add Product</h2>
	<form action="insertProduct" method="POST">
		<input type="text" name="pid" id="pid" placeholder="Prod_ID"><br>
		<input type="text" name="desc" id="desc" placeholder="Prod_DECS"><br><br>
		<button type="submit" name="btn" id="btn">Add</button>
		<button type="reset" name="btn" id="btn">Clear</button>
	</form>
</div>
</body>
</html>
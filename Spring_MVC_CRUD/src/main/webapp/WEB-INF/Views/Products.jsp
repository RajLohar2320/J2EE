<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<table border=2>
		<tr>
			<th>Prod_Id</th>
			<th>Prod_Desc</th>
			<th>Action</th>
		</tr>
		<c:forEach var="p" items="${plist}">
		<tr>
			<td>${p.pid}</td>
			<td>${p.desc}</td>
			<td>
				<a href= delete/${p.pid}>Delete</a>/
				<a href= edit/${p.pid}>Edit</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	<br>
	<a href="addProduct">Add New Product</a>
</div>

</body>
</html>
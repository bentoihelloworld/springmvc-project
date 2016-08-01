<%@page contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.bentoi.ai.*"%>

<%-- <jsp:useBean id="productDao" type="com.bentoi.ai.ProductDao" scope="request" /> --%>
<!-- <link type="text/css" href="/resources/css/table.css" rel="stylesheet" media="all" /> -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Product list</title>
</head>

<body>
	<table class="TFtable">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
			<th>Category Path</th>
			<th>Available</th>
		</tr>
		<c:forEach items="${listProducts}" var="product">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.description}</td>
				<td>${product.price}</td>
				<td>${product.categorypath}</td>
				<td>${product.available}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>
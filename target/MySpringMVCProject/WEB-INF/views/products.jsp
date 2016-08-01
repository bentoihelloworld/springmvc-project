<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.bentoi.ai.*"%>

<jsp:useBean id="productDao" type="com.bentoi.ai.ProductDao" scope="request" />
<link type="text/css" href="/resources/css/table.css" rel="stylesheet" media="all" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>bentoi 2</title>
</head>

<body>
	<table class="TFtable">
	<tr>
        <th>Name</th>
        <th>Description</th>
        <th>Price</th>
        <th>Category Path</th>
        <th>Available</th>
    </tr>
		<% for (Products p : productDao.getAllProducts()) { %>
		<tr>
		<td><%= p.getName() %></td>
		<td><%= p.getDescription() %></td>
		<td><%= p.getPrice() %></td>
		<td><%= p.getCategorypath() %></td>
		<td><%= p.getAvailable() %></td>
		</tr>
		<% } %>

	</table>
</body>
</html>
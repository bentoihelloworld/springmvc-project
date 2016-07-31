<%@page contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.bentoi.ai.*"%>

<jsp:useBean id="productDao" type="com.bentoi.ai.ProductDao" scope="request" />
<jsp:useBean id="prdct" type="com.bentoi.ai.Products" scope="request" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Add Product</title>
</head>

<body>


	<% prdct.setName("Lilys"); %>
	<% prdct.setDescription("Peanut butter"); %>
	<% prdct.setPrice(75.56); %>
	<% prdct.setCategorypath("butter"); %>
	<% prdct.setAvailable(true); %>
	<% productDao.addProduct(prdct); %>

</body>
</html>
<%@page contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.bentoi.ai.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Add Product</title>
</head>

<body>
<form:form method="post" modelAttribute="addproduct">
		<table>
			<tr>
<%-- 				<td><spring:message code="lbl.firstName" text="Product Name" /></td> --%>
				<td><form:input path="name" /></td>
<%-- 				<td><form:errors path="firstName" cssClass="error" /></td> --%>
			</tr>
			<tr>
<%-- 				<td><spring:message code="lbl.lastName" text="Last Name" /></td> --%>
				<td><form:input path="description" /></td>
<%-- 				<td><form:errors path="lastName" cssClass="error" /></td> --%>
			</tr>
			<tr>
<%-- 				<td><spring:message code="lbl.email" text="Email Id" /></td> --%>
				<td><form:input path="price" /></td>
<%-- 				<td><form:errors path="email" cssClass="error" /></td> --%>
			</tr>
			<tr>
<%-- 				<td><spring:message code="lbl.department" text="Department" /></td> --%>
<%-- 				<td><form:select path="category" items="${allDepartments}" itemValue="id" itemLabel="name" /></td> --%>
<%-- 				<td><form:errors path="department" cssClass="error" /></td> --%>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Add Product"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<h2>Employee Details</h2>
	<hr>
	<table border="1">
		<tr>
			<td>EmployeeId</td>
			<td>Name</td>
			<td>Salary</td>
		</tr>
		<c:forEach var="employee" items="${employees}">
			<tr>
				<td>${employee.employeeId }</td>
				<td>${employee.name }</td>
				<td>${employee.salary }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
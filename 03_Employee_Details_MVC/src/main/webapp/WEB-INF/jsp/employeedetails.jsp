<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<h2>Employee Details</h2>
	<hr>
	<%-- 	<form action="saveemployee" method="post"> --%>
	<!-- 		<table> -->
	<!-- 			<tr> -->
	<!-- 				<td>Employee Id</td> -->
	<!-- 				<td><input type="text" name="employeeId"></td> -->
	<!-- 			</tr> -->
	<!-- 			<tr> -->
	<!-- 				<td>Name</td> -->
	<!-- 				<td><input type="text" name="name"></td> -->
	<!-- 			</tr> -->
	<!-- 			<tr> -->
	<!-- 				<td>Salary</td> -->
	<!-- 				<td><input type="text" name="salary"></td> -->
	<!-- 			</tr> -->
	<!-- 			<tr> -->
	<!-- 				<td><input type="reset" value="reset"></td> -->
	<!-- 				<td><input type="submit" value="save"></td> -->
	<!-- 			</tr> -->
	<!-- 		</table> -->
	<%-- 	</form> --%>

	<form:form action="saveemployee" method="post"
		modelAttribute="employee">
		<table>
			<tr>
				<td>Employee Id</td>
				<td><form:input path="employeeId" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><form:input path="salary" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="reset"></td>
				<td><input type="submit" value="save"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
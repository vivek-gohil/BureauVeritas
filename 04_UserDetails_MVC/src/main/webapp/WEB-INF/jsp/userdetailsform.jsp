<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details Form</title>
</head>
<body>
	<h2>User Details</h2>
	<hr>
	<form:form action="confirmdetails" method="post"
		modelAttribute="userDetails">
		<table>
			<tr>
				<td>First Name</td>
				<td><form:input type="text" path="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input type="text" path="lastName" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td>Male <form:radiobutton path="gender" value="Male" />
				</td>
				<td>Female <form:radiobutton path="gender" value="Female" />
				</td>
			</tr>
			<tr>
				<td>Languages</td>
				<td>English<form:checkbox path="languages" value="English" /></td>
				<td>Hindi<form:checkbox path="languages" value="Hindi" /></td>
				<td>Marathi<form:checkbox path="languages" value="Marathi" /></td>
				<td>Other<form:checkbox path="languages" value="Other" /></td>
			</tr>
			<tr>
				<td>Qualification</td>
				<td><form:select path="qualification">
						<form:option value="SSC" label="SSC" />
						<form:option value="HSC" label="HSC" />
						<form:option value="Graduate" label="Graduate" />
						<form:option value="Masters" label="Masters" />
					</form:select></td>
			</tr>
			<tr>
				<td><input type="reset" value="reset"></td>
				<td><input type="submit" value="save"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
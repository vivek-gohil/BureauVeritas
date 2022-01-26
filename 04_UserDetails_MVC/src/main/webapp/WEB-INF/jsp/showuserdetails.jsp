<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>
	<h2>User Details</h2>
	<hr>
	<p>Your details are submitted successfully , please re-check your
		details</p>
	<p>First Name ${userDetails.firstName}</p>
	<p>Last Name ${userDetails.lastName }</p>
	<p>Gender ${userDetails.gender}</p>
	<p>Qualification ${userDetails.qualification}</p>
	<p>Languages</p>
	<ul>
		<c:forEach var="language" items="${userDetails.languages}">
			<li>${language}</li>
		</c:forEach>
	</ul>
</body>
</html>
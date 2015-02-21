<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Registration Form</title>

</head>

<body>

<form:form method="post" action="register" commandName="student">
	<table>
	<tr>
		<td><form:label path="firstname">First Name</form:label></td>
		<td><form:input path="firstname" /></td> 
	</tr>
	<tr>
		<td><form:label path="lastname">Last Name</form:label></td>
		<td><form:input path="lastname" /></td>
	</tr>
	<tr>
		<td><form:label path="email">Email</form:label></td>
		<td><form:input path="email" /></td>
	</tr>
	<tr>
		<td><form:label path="telephone">Telephone</form:label></td>
		<td><form:input path="telephone" /></td>
	</tr>
<tr>
<td><input type="submit" value="Submit" /></td>
</tr>
</table>
</form:form>
</body>
</html>
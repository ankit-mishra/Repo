<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search For Students</title>
</head>
<body>
<form:form commandName="student" action="addContact.html">
<table>
	<tr>
		<td><form:label path="firstname">Enrollment No.</form:label></td>
		<td><form:input path="firstname" /></td> 
		
		<td><form:label path="firstname">Student Name</form:label></td>
		<td><form:input path="firstname" /></td>
		
		<td><form:label path="firstname">Admission Date</form:label></td>
		<td><form:input path="firstname" /></td>
	</tr>
        <c:forEach var="script" items="${scripts}" varStatus="varCounter">
            <tr>
                <td>${script.name}</td>
                <td>${script.type}</td>
            </tr>
        </c:forEach>
</table>
</form:form>
</body>
</html>
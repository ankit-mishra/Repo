<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Login</title>
</head>
<body>
		<!-- ###### -->
        <div id="left_column">
          <h2>Prospective Students</h2>
          <div class="imgholder"><a href="#"><img src="images/demo/220x80.gif" alt="" /></a></div>
          <h2>Current Students</h2>
          <div class="imgholder"><a href="#"><img src="images/demo/220x80.gif" alt="" /></a></div>
          <h2>International Students</h2>
          <div class="imgholder"><a href="#"><img src="images/demo/220x80.gif" alt="" /></a></div>
          <h2>Alumni</h2>
          <div class="imgholder"><a href="#"><img src="images/demo/220x80.gif" alt="" /></a></div>
        </div>
        <!-- ###### -->
        <div id="latestnews">
          <h2>Latest News &amp; Events</h2>
          <ul>
            <li class="clear">
              <div class="imgl"><img src="images/demo/imgl.gif" alt="" /></div>
              <div class="latestnews">
                <p><a href="#">Sentumquisque morbi dui congue.</a></p>
                <p>This is a W3C compliant free website template from <a href="http://www.os-templates.com/" title="Free Website Templates">OS Templates</a>. This template is distributed using a <a href="http://www.os-templates.com/template-terms">Website Template Licence</a></p>
              </div>
            </li>
            <li class="clear">
              <div class="imgl"><img src="images/demo/imgl.gif" alt="" /></div>
              <div class="latestnews">
                <p><a href="#">Sentumquisque morbi dui congue.</a></p>
              </div>
            </li>
          </ul>
        </div>
        <!-- ###### -->
		<!-- ###### -->
        <div id="right_column">
          <div class="holder">
            <h2>Student Login</h2>
            <div class="apply">
            <form:form method="post" action="/gps/slogin"  modelAttribute="student">
					<table>
						<tr>
							<td><form:label path="userid">User Id</form:label></td>
							<td><form:input path="userid" /></td>
						</tr>
						<tr>
							<td><form:label path="password">Password</form:label></td>
							<td><form:password path="password" /></td>
						</tr>
						<tr>
							<td><input type="submit" value="Submit" /></td>
							<td><input type="reset" value="Reset" /></td>
						</tr>
					</table>
					</form:form>
					<a href="/gps/register.php">Click here to Register</a>										
				</div>
          </div>
        </div>
        <!-- ###### -->        
</body>
</html>
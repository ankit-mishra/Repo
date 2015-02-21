<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="EN" lang="EN" dir="ltr">
<head profile="http://gmpg.org/xfn/11">
<title><decorator:title default="Web Page" /></title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<meta http-equiv="imagetoolbar" content="no" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/styles/layout.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/styles/jquery-ui-1.8.21.custom.css" type="text/css" />
<!-- Homepage Specific Elements -->
<script type="text/javascript" src="scripts/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="scripts/jquery-ui-1.7.2.custom.min.js"></script>
<script type="text/javascript" src="scripts/jquery.tabs.setup.js"></script>
<!-- End Homepage Specific Elements -->
</head>
<body id="top">
<div class="wrapper row1">
  <div id="header" class="clear">
    <div class="fl_left">
      <decorator:head />
    </div>
    <div class="fl_right">
      <ul>
        <li><a href="home.php">Home</a></li>
        <li><a href="contact.php">Contact Us</a></li>
        <li><a href="#">A - Z Index</a></li>
        <li><a href="slogin.php">Student Login</a></li>
        <li class="last"><a href="login.php">Staff Login</a></li>
      </ul>
      <form action="#" method="post" id="sitesearch">
        <fieldset>
          <strong>Search:</strong>
          <input type="text" value="Search Our Website&hellip;" onfocus="this.value=(this.value=='Search Our Website&hellip;')? '' : this.value ;" />
          <input type="image" src="images/search.gif" id="search" alt="Search" />
        </fieldset>
      </form>
    </div>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper row2">
  <div class="rnd">
    <!-- ###### -->
    <div id="topnav">
      <jsp:include page="menu.jsp"/>
    </div>
    <!-- ###### -->
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper">
  <div id="featured_slide" class="clear">
    <!-- ###### -->
    <div class="overlay_left"></div>
    <div id="featured_content">
    	<jsp:include page="header.jsp" />
    </div>
    <div class="overlay_right"></div>
    <!-- ###### -->
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper row3">
  <div class="rnd">
   	<div id="container" class="clear">
     <div id="homepage" class="clear">
    	<decorator:body></decorator:body>
   	 </div>
  	</div>
  </div>
</div>
<!-- ####################################################################################################### -->
<!-- ####################################################################################################### -->
<div class="wrapper">
  <div id="copyright" class="clear">
    <jsp:include page="footer.jsp" />
   </div>
</div>
</body>
</html>
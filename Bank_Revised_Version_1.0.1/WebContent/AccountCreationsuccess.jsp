<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/Final/CSS/mystyle.css">
<link rel="stylesheet" type="text/css" href="/Final/CSS/HeaderFooter.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Footer.jsp"></jsp:include>
<%
String Aid=request.getAttribute("aid").toString();
Long aid=Long.parseLong(Aid);

%>


<div id="headerContainer" align="center" >
<div id="header">
<b>PEOPLE'S BANK</b>
<BR>
<font size="4">  <b><em>Your Own Bank.....</em></b></font>
</div>

<div  class="dropdown">
<form  action="CustomerHomePage.jsp">
 <input type=submit class="dropbtn" value="Home" /></font>
</form>
</div>




</div>

<br>
<div>


</div>
<h2 align="center">Thanks for choosing People's Bank.. You  are successfully Registered...
Your Account id is: <%=aid %></h2>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>People's Bank :: Executive Home page</title>
</head>
<link rel="stylesheet" type="text/css" href="/Final/CSS/mystyle.css">
<link rel="stylesheet" type="text/css" href="/Final/CSS/HeaderFooter.css">
<body style="background: white;">


<div id="headerContainer" align="center" >
<div id="header">
<b>PEOPLE'S BANK</b>
<BR>
<font size="4">  <b><em>Your Own Bank.....</em></b></font>
</div>


<div class="dropdown">
  <button class="dropbtn">Customer Management</button>
  <div class="dropdown-content">
    <font size="3px"> <a href="Ecreatecustomer.jsp"><b>Create Customer</b></a></font>
   <font size="3px">  <a href="EupdateCustomer.jsp"><b>Update Customer</b></a></font>
    <font size="3px"> <a href="EdeleteCustomer1.jsp"><b>Delete Customer</b></a></font>
  </div>
</div>

	&nbsp;
<div class="dropdown">
  <button class="dropbtn">Account Management</button>
  <div class="dropdown-content">
 <font size="3px">  <a href="EcreateAccount.jsp"><b>Create Account</b></a></font>
   <font size="3px">  <a href="EdeleteAccount.jsp"><b>Delete Account</b></a></font>
   
  </div>
</div>

	&nbsp;
	<div class="dropdown">
  <button class="dropbtn">Status Details</button>
  <div class="dropdown-content">
   <font size="3px">  <a href="ViewController?action=view">View Customer</a></font>
   <font size="3px">  <a href="#"><b>Account Details</b></a></font>
   
  </div>
</div>

&nbsp;

<div class="dropdown">

<form action="login.jsp">
 <input type=submit class="dropbtn" value="Log Out" /></font>
</form>

</div>
</div>
<br>
<div>

<% 
Long user=(Long)session.getValue("uname");
/* String pwd=(String)session.getValue("pass"); */
if(user!=null ) /*&& pwd!= null */
{
%>
<b><em>Welcome executive :</em></b>
<%=user %>
<%} %>
</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>People's Bank :: Cashier Home page</title>
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


<!-- <div class="dropdown">
  <button class="dropbtn">Customer Management</button>
  <div class="dropdown-content">
    <font size="3px"> <a href="https://www.google.co.in">Create Customer</a></font>
   <font size="3px">  <a href="#">Update Customer</a></font>
    <font size="3px"> <a href="#">Delete Customer</a></font>
  </div>
</div> 

	&nbsp;
<div class="dropdown">
  <button class="dropbtn">Account Management</button>
  <div class="dropdown-content">
 <font size="3px">  <a href="https://www.google.co.in">Create Account</a></font>
   <font size="3px">  <a href="#">Update Account</a></font>
    <font size="3px"> <a href="#">Delete Acount</a></font>
  </div>
</div>

	&nbsp;-->
	<div class="dropdown">
  <button class="dropbtn">Status Details</button>
  <div class="dropdown-content">
   <font size="3px">  <a href="https://www.google.co.in">Customer Details</a></font>
   <font size="3px">  <a href="transfer.jsp">Account Details</a></font>
   
  </div>
</div>

&nbsp;

<div class="dropdown">
  <button class="dropbtn">Account Operations</button>
  <div class="dropdown-content">
    <font size="3px"> <a href="withdrawhome.jsp">Withdrawal</a></font>
   <font size="3px">  <a href="transhome.jsp">Deposit</a></font>
    <font size="3px"> <a href="#">Cash Transfer</a></font>
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

<% 
Long user=(Long)session.getValue("uname");
/* String pwd=(String)session.getValue("pass"); */
if(user!=null) /* && pwd!= null) */
{
%>
<b><em>Welcome executive :</em></b>
<%=user %>
<%} %>


</body>
</html>
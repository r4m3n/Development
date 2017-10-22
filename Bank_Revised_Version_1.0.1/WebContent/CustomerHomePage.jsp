<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>People's Bank :: Customer Home Page</title>

<link rel="stylesheet" type="text/css" href="/Final/CSS/mystyle.css">
<link rel="stylesheet" type="text/css" href="/Final/CSS/HeaderFooter.css">

<script type="text/javascript" src="/Final/JS/validations.js">
</script>
</head>


<body style="background: white">
<jsp:include page="Footer.jsp"></jsp:include>



<div id="headerContainer" align="center" >
<div id="header">
<b>PEOPLE'S BANK</b>
<BR>
<font size="4">  <b><em>Your Own Bank.....</em></b></font>
</div>

<div class="dropdown">
  <button class="dropbtn">Customer Management</button>
  <div class="dropdown-content">
   <font size="3px">  <a href="CustomerDetailsForUpdate?action=cupdate"><b>Update</b></a></font>
    <font size="3px"> <a href="DeleteContollerForCustomer?action=cdelete"><b>Delete</b></a></font>
  </div>
</div>





	&nbsp;
<div class="dropdown">
  <button class="dropbtn">Account Management</button>
  <div class="dropdown-content">
 <font size="3px"> <a href="CcreateAccount?action=cacc"><b>Create Account</b></a></font>
   <font size="3px"> <a href="CdeleteAccount?action=dacc"><b>Delete Account</b></a></font>
  </div>
</div>

	&nbsp;
	<div class="dropdown">
  <button class="dropbtn">Status Details</button>
  <div class="dropdown-content">
   <font size="3px">  <a href="ViewCustomerDetails?action=cview"><b>Customer Details</b></a></font>
   <font size="3px">  <a href="CustomerAccountView?action=view"><b>Account Details</b></a></font>
   
  </div>
</div>

&nbsp;

<div class="dropdown">

<form action="login.jsp">
 <input type=submit class="dropbtn" value="Log Out" />
</form>

</div>
</div>
<br>
<div>


</div>


<% 
Long user=(Long)session.getValue("uname");
/* String pwd=(String)session.getValue("pass"); */
if(user!=null)/*  && pwd!= null) */
{
%>
<b><em>Welcome Customer :</em></b>
<%=user %>
<%} %>
</body>

</div></div>

</head>

</html>
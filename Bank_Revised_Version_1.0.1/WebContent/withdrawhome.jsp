<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="/Final/CSS/mystyle.css">
<link rel="stylesheet" type="text/css" href="/Final/CSS/HeaderFooter.css">
</head>
<body>
<div id="headerContainer" align="center" >
<div id="header">
<b>PEOPLE'S BANK</b>
<BR>
<font size="4">  <b><em>Your Own Bank.....</em></b></font>
</div>
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
 <font size="3px">  <a href="https://www.google.co.in"><b>Create Account</b></a></font>
   <font size="3px">  <a href="#"><b>Update Account</b></a></font>
    <font size="3px"> <a href="#"><b>Delete Account</b></a></font>
  </div>
</div>

	&nbsp;
	<div class="dropdown">
  <button class="dropbtn">Status Details</button>
  <div class="dropdown-content">
   <font size="3px">  <a href="ViewCustomerDetails?action=cview"><b>Customer Details</b></a></font>
   <font size="3px">  <a href="#"><b>Account Details</b></a></font>
   
  </div>
</div>

&nbsp;

<div class="dropdown">

<form action="login.jsp">
 <input type=submit class="dropbtn" value="Log Out" />
</form>

</div>

<br>
<div>


</div>

<h2 align ="center">Withdraw Money</h2>
	<form action="WithdrawController" method="post" name="withdrawform">
	
	<table align="center">
		<tr>
			<td>Enter Account Id</td>
			<td><input type="text" name="accountid" ></td>
			</tr>
			<tr>
			<td colspan="2" align ="center" ><input type="submit" name="WithdrawSubmit" value="submit"/></td>
		</tr>
	</table>
	
	</form>
	
<%@ include file="Footer.jsp" %>	
</body>
</html>
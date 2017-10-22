<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>People's Bank :: Update by Executive</title>
<link rel="stylesheet" type="text/css" href="/Final/CSS/mystyle.css">
<link rel="stylesheet" type="text/css" href="/Final/CSS/HeaderFooter.css">
<script type="text/javascript" src="/Final/JS/validations.js">
</script>
</head>
<body  style="background: white">
<jsp:include page="Footer.jsp"></jsp:include>
<div id="headerContainer" align="center" >
<div id="header">
<b>PEOPLE'S BANK</b>
<BR>
<font size="4">  <b><em>Your Own Bank.....</em></b></font>
</div>
<div class="dropdown">
<form action="ExecutiveHomePage.jsp">
 <input type=submit class="dropbtn" value="Home" />
</form>
</div>
<div class="dropdown">
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
    <font size="3px"> <a href="#">Delete Account</a></font>
  </div>
</div>
	&nbsp;
	<div class="dropdown">
  <button class="dropbtn">Status Details</button>
  <div class="dropdown-content">
   <font size="3px">  <a href="https://www.google.co.in">Customer Details</a></font>
   <font size="3px">  <a href="#">Account Details</a></font>
  </div>
</div>
&nbsp;
<div class="dropdown">
  <button class="dropbtn">Account Operations</button>
  <div class="dropdown-content">
    <font size="3px"> <a href="https://www.google.co.in">Withdrawal</a></font>
   <font size="3px">  <a href="#">Deposit</a></font>
    <font size="3px"> <a href="#">Cash Transfer</a></font>
  </div>
</div>
&nbsp;
<div class="dropdown">
 <form action="login.jsp">
 <input type=submit class="dropbtn" value="Log Out" />
</form>
</div>
</div>
<h3 ALIGN="CENTER">ENTER SSNID AND CUSTOMERID</h3><br><br>
<script type="text/javascript" src="javascript/validation.js">
</script>
<form action="UpdateController1" method="post" name="updateForm" onsubmit=chkssnId()>
<table border="1" align="center">
	<tr>
		<td>SSNID</td><td><input type="text" name="ssnid"  ></td>
	</tr>
	<tr>
		<td>CustId</td><td><input type="text" name="custid" ></td>
	</tr>
	<tr >
		<td colspan="2" align ="right" ><input type="submit" name="updatebtn" value="update" /></td>
	</tr>
</table>
</form>
</body>
</html>
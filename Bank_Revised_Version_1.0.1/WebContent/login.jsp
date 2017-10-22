<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>People's Bank :: Login</title>

<link rel="stylesheet" type="text/css" href="/Bank_Revised_Version_1.0.1/CSS/mystyle.css">
<link rel="stylesheet" type="text/css" href="/Bank_Revised_Version_1.0.1/CSS/HeaderFooter.css">

<script type="text/javascript" src="/Bank_Revised_Version_1.0.1/JS/validations.js">
</script>

</head>
<body style="background: white">
<jsp:include page="Footer.jsp"></jsp:include>

<% session.invalidate(); %>

<div id="headerContainer" align="center" >
<div id="header">
<b>PEOPLE'S BANK</b>
<BR>
<font size="4">  <b><em>Your Own Bank.....</em></b></font>
</div></div>


<form action="Login_Controller" method="post" name="loginform">
<div id=homeContainer >

<div id=home>

<div id=login style="width:300px; float:left;">
	<table id=logintable cellspacing=3 cellpadding=3>
		<tr>
			<td align="center" id=heading colspan=2><b>Login Here</b></td>
		</tr>
		<tr>
			<td>User name: </td>
			<td><input type="text" name=username id=ssnid placeholder="Enter username"></td>
		</tr>
		<tr>
			<td>Password: </td>
			<td><input type="password" name="password" id="pwd" placeholder="Enter password"></td>
		</tr>
		<tr>
			<td >Role : </td>
			<td><select name="select">
					<option value="Customer">Customer</option>
					<option value="Executive">Executive</option>
					<option value="Cashier">Cashier</option>
				</select></td>
		</tr>
		<tr>
			<td align=center colspan=2><input type="Submit" name="action" value="Login" onclick="return loginValidation()"></td>
		</tr>
		<tr>
			<td align=center colspan=2><a href="NewCustomerRegistration.jsp" color="red">New User? Click here to Register</a></td>
		</tr>
		
	</table>
</div>


</div>

</div>

</form>
<div style="width:1500px; height:25px"></div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create New Customer</title>
<link rel="stylesheet" type="text/css" href="/Final/CSS/mystyle.css">
<link rel="stylesheet" type="text/css" href="/Final/CSS/HeaderFooter.css">

<script type="text/javascript" src="/Final/JS/validations.js">
</script>
</head>
<body style="background: white;">


<div id="headerContainer" align="center" >
<div id="header">
<b>PEOPLE'S BANK</b>
<BR>
<font size="4">  <b><em>Your Own Bank.....</em></b></font>
</div>

<div  class="dropdown">
<form  action="login.jsp">
 <input type=submit class="dropbtn" value="Home" /></font>
</form>
</div>




</div>

<br>

<form name="form" action="CcreateCustomerController" method="post">
<div id="FormMasterContainer">

<br>	
<div id="FormContainer" align="center">
<div id="Form">
<table cellspacing=3 cellpadding=3>
	<tr>
		<td >Ssnid:<span id=mandatory>*</span></td>
		<td><input type="text" name="ssnid" id="ssnid" placeholder="Enter Customer ssnid">&nbsp;</td>
	</tr>
	<tr>
		<td >Customer Name:<span id=mandatory>*</span></td> 
		<td><input type="text" name="cname" id="cname" placeholder="Enter Customer Name">&nbsp;</td>
	</tr>
	<tr>
		<td >Address:<span id=mandatory>*</span></td>
		<td><input type="text" name="add" id="add2" placeholder="Enter Address">&nbsp;</td>
	</tr>
	<tr>
		<td >City:<span id=mandatory>*</span></td>
		<td><input type="text" name="city" id="city" placeholder="Enter Customer city">&nbsp;</td>
	</tr>
	<tr>
		<td >State:<span id=mandatory>*</span></td>
		<td><input type="text" name="state" id="state" placeholder="Enter Customer State">&nbsp;</td>
	</tr>
	<tr>
		<td >Age:<span id=mandatory>*</span></td>
		<td><input type="text" name="age" id="age" placeholder="Enter Customer Age">&nbsp;</td>
	</tr>
	<tr>
		<td >Password:<span id=mandatory>*</span></td>
		<td><input type="password" name="pwd"  placeholder="Enter Passworde">&nbsp;</td>
	</tr>
	<tr>
		<td align=center colspan=2>
			<input type="Submit" name="custaction" value="Create" onclick="return createCustvalidation()">&nbsp;
			<input type="Submit" name="action" value="Back">
		</td>
	</tr>
</table>
</div>
</div>

</div>

</form>
</body>
</html>
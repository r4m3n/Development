<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="/Final/JS/validations.js">

function chkssnId()
{
	if(document.accountform.customerid.value == "" || document.accountform.customerid.value == null)
		alert("Customer Id can't be Null/Empty");
	document.accountform.customerid.focus();
	return false;
	
}

function isNAN()
{
	if(isNaN(document.accountform.customrtid.value))
		alert("Customer Id should be numeric...!");
	document.accountform.customerid.focus();
	return false;
}
</script>
</head>
<body><h2 align="center">Create Account</h2><br><br>
<form action="createcontroller" method="post" name="accountform"   >
<table  align="center">
<tr>
			<td>CustomerId</td><td><input type="text" name="customerid" onblur="isNAN()"></td>
		</tr>
		<tr>
			<td>Account type</td>
			<td>
			<select name="accounttype"> 
			<option value="select"></option>
			<option value="current">Current</option>
			<option value="savings">Savings</option>
			</select>
			</td>
		</tr>
		<tr>
			<td>Deposited balance</td><td><input type="text" name="balance" onblur="isNAN()"></td>
			<tr >
		
		<td colspan="2" align ="center" ><input type="submit" name="updatebtn" value="submit" onclick="return chkssnId();"/></td>
		</tr>
		
		</table>
		</form>
		

</body>
</html>
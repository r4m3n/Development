<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="java.sql.*"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Create Account</title>
<link rel="stylesheet" type="text/css" href="/Final/CSS/mystyle.css">
<link rel="stylesheet" type="text/css" href="/Final/CSS/HeaderFooter.css">
<script type="text/javascript"  >

function Validate() {
	
	 var num=/^[0-9]+$/;
	var bal=document.forms["accountform"]["balance"].value;
	if ( document.forms["accountform"]["accounttype"].value == "select") {
	alert("Please select Account Type!");
	return false;
	}
if(bal == ""){
	alert("Please enter deposit amount!");
	return false;
}

if(!bal.match(num)){
	alert("Please enter only numerics in amount");
	return false;
}
	return true;
	
	}
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
<form  action="CustomerHomePage.jsp">
 <input type=submit class="dropbtn" value="Home" /></font>
</form>
</div>




</div>

<br>

<%

ArrayList<CustomerPojo> al=(ArrayList<CustomerPojo>)request.getAttribute("resultsetFromUpdateCustomer");

if(al==null)
{
%>
<h2>No Details To Show</h2>
<%		
}
else
{
	for(CustomerPojo c:al)
	{
%>

<h2 align="center">Create Account</h2><br><br>
<form action="createcontroller" method="post" name="accountform"   >
<div id="FormMasterContainer">

<br>	
<div id="FormContainer" align="center">
<div id="Form">
<table  align="center">
<tr>
			<td >CustomerId</td><td><input value="<%=c.getCustId() %>" type="text" name="customerid"  readonly></td>
		</tr>
		<tr>
			<td>Account type</td>
			<td>
			<select name="accounttype"> 
			<option value="select">-select-</option>
			<option value="current">Current</option>
			<option value="savings">Savings</option>
			</select>
			</td>
		</tr>
		<tr>
			<td>Deposit Amount</td><td><input type="text" name="balance" ></td>
			<tr >
		<% } 
	
	}
	
	%>
		<td colspan="2" align ="center" ><input type="submit" name="updatebtn" value="submit" onclick="return Validate()" /></td>
		</tr>
		
		</table>
		</form>
		
</body>
</html>
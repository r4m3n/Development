<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/Final/CSS/mystyle.css">
<link rel="stylesheet" type="text/css" href="/Final/CSS/HeaderFooter.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Customer Details</title>
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
ResultSet result=(ResultSet)request.getAttribute("resultsetFromViewCustomerController");
while(result.next()){
	int i=result.getInt(1);
	System.out.println(i);

%>

<h1 align="center">CUSTOMER PROFILE</h1>
<form method="post" action="UpdateController" name="form1" onsubmit=myfunction()>
<div id="FormMasterContainer">

<br>	
<div id="FormContainer" align="center">
<div id="Form">
<div id="FormMasterContainer">


	<table  align="center"> 
		<tr>
			<td>Customer SSNID</td><td><input type="text" name="ssnid" onblur="myFunction()" value="<%=result.getInt(1)  %>" readonly></td>
		</tr>
		<tr>
			<td>Customer ID</td><td><input type="text" name="custid" onblur="myFunction()" value="<%=result.getLong(2)%>" readonly></td>
		</tr>
		<tr>
			<td>Customer Name</td><td><input type="text" name="custname" onblur="myFunction()" value="<%=result.getString(3)%>"></td>
		</tr>
	
		<tr>
			<td> Address</td><td><input type="text" name="oldaddress" onblur="myFunction()" value="<%=result.getString(5)%>"/></td>
		</tr>
		
		<tr>
			<td>Age</td><td><input type="text" name="oldage"  onblur="myFunction()" value="<%=result.getString(4)%>"></td>
		</tr>
		<tr>
			<td>State</td><td><input type="text" name="oldage"  onblur="myFunction()" value="<%=result.getString(6)%>"></td>
		</tr>
		<tr>
			<td>City</td><td><input type="text" name="oldage"  onblur="myFunction()" value="<%=result.getString(7)%>"></td>
		</tr>
		<tr>
			<td>Last Updated</td><td><input type="text" name="oldage"  onblur="myFunction()" value="<%=result.getString(9)%>"></td>
		</tr>
	
		
		<%} %>
		
	</table>
	</form>
	
</body>
</html>
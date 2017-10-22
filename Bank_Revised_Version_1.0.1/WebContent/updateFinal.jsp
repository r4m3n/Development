<%@page import="com.bean.CustomerPojo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="javascript/validation2.js">
</script>
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
 <input type=submit class="dropbtn" value="Home" /></font>
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
 <input type=submit class="dropbtn" value="Log Out" /></font>
</form>
</div>
</div>
<script type="text/javascript">
function myFunction() {
	document.forms["form1"]["custname"].readOnly = true;
    document.getElementById("custid").readOnly = true;
    document.getElementById("ssnid").readOnly = true;
    document.getElementByName("oldaddress").readOnly = true;
    document.getElementById("oldage").readOnly = true;
}
</script>
</head>
<body>
<% 
ArrayList<CustomerPojo> list = (ArrayList<CustomerPojo>)request.getAttribute("executiveUpdateArrayList");

if(list == null)
{%>
	<h2>No Elements</h2>
<%}

else
{
	for(CustomerPojo pojo : list)
	{%>
	<h1 align="center">UPDATE CUSTOMER</h1>
	<form method="post" action="UpdateController" name="form1" onclick=myfunction()>
	<table border="1" align="center"> 
		<tr>
			<td>Customer SSNID</td><td><input type="text" name="ssnid" onblur="myFunction()" value="<%=pojo.getSsnId()%>" readonly></td>
		</tr>
		<tr>
			<td>Customer ID</td><td><input type="text" name="custid" onblur="myFunction()" value="<%=pojo.getCustId()%>" readonly></td>
		</tr>
		<tr>
			<td>Old customer Name</td><td><input type="text" name="custname" onblur="myFunction()" value="<%=pojo.getCustName()%>" readonly></td>
		</tr>
		<tr>
			<td>New customer Name</td><td><input type="text"  name="newcustname" value="<%=pojo.getCustName()%>"></td>
		</tr>
		<tr>
			<td>old address</td><td><input type="text" name="oldaddress" onblur="myFunction()" value="<%=pojo.getCustAddress()%>" readonly/></td>
		</tr>
		<tr>
			<td>new address</td><td><input type="text" name="newaddress" value="<%=pojo.getCustAddress()%>"></td>
		</tr>
		<tr>
			<td>old age</td><td><input type="text" name="oldage"  onblur="myFunction()" value="<%=pojo.getCustAge()%>" readonly></td>
		</tr>
		<tr>
			<td>new age</td><td><input type="text" name="newage" value="<%=pojo.getCustAge()%>"></td>
		</tr>
		<tr >
		<td colspan="2" align ="center" ><input type="submit" name="updatebtn" value="update"/></td>
		</tr>
		<%} }%>
	</table>
	</form>
</body>
</html>
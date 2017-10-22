<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/Final/CSS/mystyle.css">
<link rel="stylesheet" type="text/css" href="/Final/CSS/HeaderFooter.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>People's Bank :: Customer Home Page</title>
<script type="text/javascript" src="/Final/JS/validations.js">
</script>
</head>
<body style="background: white;">
<jsp:include page="Footer.jsp"></jsp:include>


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


<h1 align="center">UPDATE CUSTOMER</h1>
<div id="FormMasterContainer">

<br>	
<div id="FormContainer" align="center">
<div id="Form">
<form method="post" action="CustomerUpdateController" name="form1" onsubmit="return validateForm()" >
	<table  align="center"> 
		<tr>
			<td>Customer SSNID</td><td><input type="text" name="ssnid"  value="<%=c.getSsnId() %>" readonly></td>
		</tr>
		<tr>
			<td>Customer ID</td><td><input type="text" name="custid"  value="<%=c.getCustId() %>" readonly></td>
		</tr>
		<tr>
			<td>Old customer Name</td><td><input type="text" name="custname"  value="<%=c.getCustName() %>"readonly></td>
		</tr>
		<tr>
			<td>New customer Name</td><td><input type="text" id="newcustname" name="newcustname"></td>
		</tr>
		<tr>
			<td>old address</td><td><input type="text" name="oldaddress" value="<%=c.getCustAddress() %>" readonly></td>
		</tr>
		<tr>
			<td>new address</td><td><input type="text" name="newaddress" ></td>
		</tr>
		<tr>
			<td>old age</td><td><input type="text" name="oldage"   value="<%=c.getCustAge() %>" readonly></td>
		</tr>
		<tr>
			<td>new age</td><td><input type="text" name="newage" ></td>
		</tr>
		<tr >
	
			<td colspan="2" align ="center" ><input type="submit" name="updatebtn" value="update" /></td>
		</tr>
		<% } 
	}
	%>
	</table>
	</form>
	</div></div></div>
</body>
</html>
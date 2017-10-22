<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="com.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete customer page</title>
<script type="text/javascript">
function myFunction() {
    document.getElementById("custid").readOnly = true;
    document.getElementById("ssnid").readOnly = true;
    document.getElementById("custname").readOnly = true;
    document.getElementById("oldaddress").readOnly = true;
    document.getElementById("oldage").readOnly = true;
    document.getElementById("oldcityname").readOnly = true;
    document.getElementById("oldStatename").readOnly = true;
}
</script>
<body>
<%
ArrayList<CustomerPojo> delAl=(ArrayList<CustomerPojo>)request.getAttribute("arraylistFromDeleteCustomer");
if(delAl == null)
{
%>
<h2>No Details To Show</h2>
<%		
}
else
{
	for(CustomerPojo c : delAl)
	{
%>
<h1 align="center">CUSTOMER DETAILS</h1>
<form method="post" action="DeleteCustomer" name="form1" onsubmit=myfunction()>
	<table border="1" align="center"> 
		<tr>
			<td>Customer SSN_ID</td><td><input type="text" name="ssnid" onblur="myFunction()" value="<%=c.getSsnId() %>" readonly></td>
		</tr>
		<tr>
			<td>Customer ID</td><td><input type="text" name="custid" onblur="myFunction()" value="<%=c.getCustId() %>" readonly></td>
		</tr>
		<tr>
			<td>Customer Name</td><td><input type="text" name="custname" onblur="myFunction()" value="<%=c.getCustName() %>"readonly></td>
		</tr>
		<tr>
			<td>Age</td><td><input type="text" name="oldage"  onblur="myFunction()" value="<%=c.getCustAge() %>" readonly></td>
		</tr>
		<tr>
			<td>Address</td><td><input type="text" name="oldaddress" onblur="myFunction()" value="<%=c.getCustAddress() %>" readonly></td>
		</tr>
		<tr>
			<td>City</td><td><input type="text" name="oldcityname"  onblur="myFunction()" value="<%=c.getCity() %>" readonly>
		</tr>
		<tr>
			<td>State</td><td><input type="text" name="oldStatename"  onblur="myFunction()" value="<%=c.getState() %>" readonly></td>
		</tr>
		<tr >
	<% }
	}
	%>
		<td colspan="2" align ="center" ><input type="submit" name="updatebtn" value="Delete"/></td>
		</tr>
	</table>
	</form>
</body>
</html> --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>People's Bank :: Customer Delete Page</title>
<link rel="stylesheet" type="text/css" href="/Final/CSS/mystyle.css">
<link rel="stylesheet" type="text/css" href="/Final/CSS/HeaderFooter.css">
<script type="text/javascript">
function myfunction(){
	
	return confirm("Are you sure to delete?");
}
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

<div  class="dropdown">
<form  action="CustomerHomePage.jsp">
 <input type=submit class="dropbtn" value="Home" /></font>
</form>
</div>




</div>
<%
ArrayList<CustomerPojo> al=(ArrayList<CustomerPojo>)request.getAttribute("arraylistFromDeleteCustomer");
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
<h1 align="center">Your Profile</h1>
<form method="post" action="DeleteCustomer" name="form1" >
<div id="FormMasterContainer">

<br>	
<div id="FormContainer" align="center">
<div id="Form">
	<table  align="center"> 
		<tr>
			<td>Customer SSNID</td><td><input type="text" name="ssnid"  value="<%=c.getSsnId() %>" readonly></td>
		</tr>
		<tr>
			<td>Customer ID</td><td><input type="text" name="custid" value="<%=c.getCustId() %>" readonly></td>
		</tr>
		<tr>
			<td>Customer Name</td><td><input type="text" name="custname"  value="<%=c.getCustName() %>"readonly></td>
		</tr>
		
		
		<tr>
			<td>Address:</td><td><input type="text" name="oldaddress" value="<%=c.getCustAddress() %>" readonly></td>
		</tr>
	
		<tr>
			<td>Age:</td><td><input type="text" name="oldage"  value="<%=c.getCustAge() %>" readonly></td>
		</tr>
		
		
		<tr>
			<td>City:</td><td><input type="text" name="oldcityname"  value="<%=c.getCity() %>" readonly>
		</tr>
		
		
	
		
		<tr>
			<td>State:</td><td><input type="text" name="oldStatename"   value="<%=c.getState() %>" readonly></td>
		</tr>
		
		
		
		<tr >
	<% } %>
			<td colspan="2" align ="center" ><input type="submit" name="updatebtn" value="Delete" onclick="return myfunction()"/></td>
		</tr>
		<% } %>
	</table>
	</form>
	
</body>
</html>
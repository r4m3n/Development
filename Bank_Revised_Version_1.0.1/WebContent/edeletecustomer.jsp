<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*"%>
     <%@ page import="com.bean.*" %>
      <%@ page import="java.util.*"%>
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
}
</script>
<%

ArrayList<CustomerPojo> al=(ArrayList<CustomerPojo>)request.getAttribute("resultsetFromDeleteCustomer1");
if(al!=null)
{
	for(CustomerPojo c: al){
		
	
%>



</head>
<body>


<h1 align="center">DELETE CUSTOMER</h1>
<form method="post" action="EdeleteCustomerDetailsController1" name="form1" onsubmit=myfunction()>
	<table border="1" align="center"> 
		<tr>
			<td>Customer SSNID</td><td><input type="text" name="ssnid" onblur="myFunction()" value="<%=c.getSsnId() %>" readonly></td>
		</tr>
		<tr>
			<td>Customer ID</td><td><input type="text" name="custid" onblur="myFunction()" value="<%=c.getCustId() %>" readonly></td>
		</tr>
		<tr>
			<td>Customer Name</td><td><input type="text" name="custname" onblur="myFunction()" value="<%=c.getCustName() %>"></td>
		</tr>
		
		<tr>
			<td>Address</td><td><input type="text" name="oldaddress" onblur="myFunction()" value="<%=c.getCustAddress() %>"/></td>
		</tr>
		
		<tr>
			<td>Age</td><td><input type="text" name="oldage"  onblur="myFunction()" value="<%=c.getCustAge() %>"></td>
		</tr>
	
		
		<tr>
			<td>City Name</td><td><input type="text" name="oldcityname"  onblur="myFunction()" value="<%=c.getCity() %>"></td>
		</tr>
	
		<tr >
		
		<tr>
			<td>State Name</td><td><input type="text" name="oldStatename"  onblur="myFunction()" value="<%=c.getState() %>"></td>
		</tr>
	
		<tr >
	<% } }%>	
		<td colspan="2" align ="center" ><input type="submit" name="updatebtn" value="Delete"/></td>
		</tr>
	
		
	</table>
	</form>
</body>
</html>
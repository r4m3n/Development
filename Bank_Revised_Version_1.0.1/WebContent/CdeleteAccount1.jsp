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
<title>Insert title here</title>
<script type="text/javascript"  >

function Validate() {
	
	 var num=/^[0-9]+$/;
	var accid=document.forms["accountform"]["accountid"].value;

if(accid== ""){
	alert("Please enter Account_Id!");
	return false;
}

if(accid.length!= 6){
	alert("Account_Id should be 6 digit number!");
	return false;
	}
	
if(!accid.match(num)){
	alert("Please enter only numerics in Account_Id");
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

<h2 align="center">Delete Account</h2><br><br>
<div id="FormMasterContainer">

<br>	
<div id="FormContainer" align="center">
<div id="Form">
<form action="CustomerDelAccController" method="post" name="accountform"   >
<table  align="center">
<tr>
			<td >CustomerId</td><td><input value="<%=c.getCustId() %>" type="text" name="customerid"  readonly></td>
		</tr>
		
		<tr>
			<td >Enter Account Id</td><td><input  type="text" name="accountid"  ></td>
		</tr>
		
		
				<% } 
	
	}
	
	%>
		<td colspan="2" align ="center" ><input type="submit" name="updatebtn" value="submit" onclick="return Validate()" /></td>
		</tr>
		
		</table>
		</form>
</body>
</html>
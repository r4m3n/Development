<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/Final/CSS/mystyle.css">
<link rel="stylesheet" type="text/css" href="/Final/CSS/HeaderFooter.css">

</head>
<body>
<div id="headerContainer" align="center" >
<div id="header">
<b>PEOPLE'S BANK</b>
<BR>
<font size="4">  <b><em>Your Own Bank.....</em></b></font>
</div>
</div>
<div class="dropdown">
  <button class="dropbtn">Customer Management</button>
  <div class="dropdown-content">
   <font size="3px">  <a href="CustomerDetailsForUpdate?action=cupdate"><b>Update</b></a></font>
    <font size="3px"> <a href="DeleteContollerForCustomer?action=cdelete"><b>Delete</b></a></font>
  </div>
</div>





	&nbsp;
<div class="dropdown">
  <button class="dropbtn">Account Management</button>
  <div class="dropdown-content">
 <font size="3px">  <a href="https://www.google.co.in"><b>Create Account</b></a></font>
   <font size="3px">  <a href="#"><b>Update Account</b></a></font>
    <font size="3px"> <a href="#"><b>Delete Acount</b></a></font>
  </div>
</div>

	&nbsp;
	<div class="dropdown">
  <button class="dropbtn">Status Details</button>
  <div class="dropdown-content">
   <font size="3px">  <a href="ViewCustomerDetails?action=cview"><b>Customer Details</b></a></font>
   <font size="3px">  <a href="#"><b>Account Details</b></a></font>
   
  </div>
</div>

&nbsp;

<div class="dropdown">

<form action="login.jsp">
 <input type=submit class="dropbtn" value="Log Out" />
</form>

</div>

<br>
<div>


</div>


<script>
function chkssnId(){
	var ssnid=document.form1.depositammount.value;
	var letters=/^[0-9]+$/;
	if(ssnid!=null&&ssnid.length>0)
	{
			if(!letters.test(ssnid))
			{
					alert("only numeric values");
					//document.form1.depositammount.focus();
					return false;
			}
	}
	else{
		alert("please enter SSNID");
		document.form1.depositammount.focus();
		return false;	
		
	}
}
</script>
<% 
ResultSet result=(ResultSet)request.getAttribute("resultset");
while(result.next()){
	

%>

<h1 align="center">Withdraw Money</h1>
<form method="post" action="WithdrawController1" name="form1" >
	<table border="1" align="center"> 
		
		<tr>
			<th>Customer ID</th><td><%=result.getLong(1)  %> </td>
		</tr>
		<tr>
			<th>Account Id</th><td><input type="text" name="accountid" value="<%=result.getLong(2)  %>"> </td>
		</tr>
		<tr>
			<th>Account Type</th><td><%=result.getString(3)  %></td>
		</tr>
	   <tr>
			<th>Balance</th><td><%=result.getDouble(4)  %></td>
		</tr><%} %>
     <tr>
			<th>Withdraw Amount</th><td><input type="text"  name="depositammount"></td>
		</tr>
		<tr >
		
		<td colspan="2" align ="center" ><input type="submit" name="DepSubmit" value="submit" onclick="return chkssnid()"/></td>
		</tr>
		
		
		</table>
		</form>

</body>
</html>
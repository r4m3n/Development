<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.bean.Account"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/Final/CSS/mystyle.css">
<link rel="stylesheet" type="text/css" href="/Final/CSS/HeaderFooter.css">
<title>Insert title here</title>
 <script type="text/javascript" src="pagination.js"></script>

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
				ArrayList<Account> al=(ArrayList<Account>) request.getAttribute("cuslist");
				if(al==null)
				{
			%>
				<h2>No customer to Show</h2>
			<%		
				}
				else
				{
			%>
			<br><br><br>
			<table align="center"  cellspacing="5" cellpadding="5" id="results"><tr></tr><tr></tr><tr></tr>
			<tr>
				<th>CustomerId</th>
				<th>Account_Id</th>
				<th>Account_Type</th>
				<th>Account_Status</th>
				<th>Message</th>
				<th>LastUpdated</th>
				<th>Balance</th>
			</tr>
			<%
				for(Account c : al)
				{
			%>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td align="center" ><%= c.getCustomerId() %></td>
				<td align="center" ><%= c.getAccountId() %></td>
				<td align="center"><%=c.getAccountype() %></td>
				<td align="center"><%=c.getAcctstatus() %></td>
				<td align="center"><%=c.getMessage() %></td>
				<td align="center"><%=c.getDate() %></td>
				<td align="center"><%=c.getAmount() %></td>
				
			</tr>
			
			<%
				}
				}
			%>
			                              
			
		</table>
		
	
</body>
</html>
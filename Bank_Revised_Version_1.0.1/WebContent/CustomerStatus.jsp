<%@page import="com.bean.CustomerPojo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

			<%
				ArrayList<CustomerPojo> al=(ArrayList<CustomerPojo>) request.getAttribute("csList1");
				if(al==null)
				{
			%>
				<h2>No customer to Show</h2>
			<%		
				}
				else
				{
			%>
			<table align="center" border="1" cellspacing="5" cellpadding="5">
			<tr>
				<th>CustomerId</th>
				<th>SSNid:</th>
				<th>Status</th>
				<th>Message</th>
				<th>LastUpdated</th>
				<th>View Profile</th>
			</tr>
			<%
				for(CustomerPojo c : al)
				{
			%>
			<tr>
				<td align="center" ><%=c.getCustId() %></td>
				<td align="center" ><%=c.getSsnId() %></td>
				<td align="center"><%=c.getStatus() %></td>
				<td align="center"><%=c.getMessage() %></td>
				<td align="center"><%=c.getLastUpdated() %></td>
				<td align="center"><a href="CustomerController?action=show&id=<%=c.getCustId() %>">View Profile</a>
			</tr>
			
			<%
				}
				}
			%>
			
		</table>
	
		
</body>
</html>
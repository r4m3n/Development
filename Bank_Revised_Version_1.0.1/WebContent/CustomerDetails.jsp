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
				ArrayList<CustomerPojo> al=(ArrayList<CustomerPojo>) request.getAttribute("csList");
				if(al==null)
				{
			%>
				<h2>No Details To Show</h2>
			<%		
				}
				else
				{
			%>

			<table align="center" border="1" cellspacing="5" cellpadding="5">
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Address</th>
				<th>State</th>
				<th>City</th>
			</tr>
			<%
				for(CustomerPojo c : al)
				{
			%>
			<tr>
				<td align="center" ><%=c.getCustName() %></td>
				<td align="center"><%=c.getCustAge() %></td>
				<td align="center"><%=c.getCustAddress() %></td>
				<td align="center"><%=c.getState() %></td>
				<td align="center"><%=c.getCity() %></td>
			</tr>
			
			<%
				}
				}
			%>
			
		</table>
	

</body>
</html>
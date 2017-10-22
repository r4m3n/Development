<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
			header, footer
			{
   					 padding: 1em;
   					 color: white;
  				     background-color: black;
   					 clear: left;
   					 text-align: center;
			}
			
		</style>
<script>
	function empty()
	{
		if(document.form.accId.value=="" || document.form.accId.value== null)
		{
			alert("Customer Id cannot be empty");
			return false;
		}

		if(document.form.accType.value=="" || document.form.accType.value== null)
		{
			alert("Customer address cannot be empty");
			return false;
		}
	}
	
	function isNAN()
	{
		if(isNaN(document.form.ssnId.value))
			alert("SSN Id has to be a number");
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body bgcolor="#808080">
	

		<center>
			<form name="form" method="post" action="ExecutiveDeleteController" onSubmit="empty()">
				<h1>Delete Account</h1>
				<table>
  					<tr>
   						 <td>Account Id</td>
  					     <td><input type="text" name="accId" onblur="isNAN()"/></td> 
 				    </tr>
 				    <tr>
    					 <td>Account Type</td>
    					 <td>
  						 	<select name="accType">
  								<option value="select">--Select--</option>
  								<option value="savings">Savings</option>
  								<option value="current">Current</option>
						    </select>
						 </td>
 				    </tr>
				</table>
				<br>
				<input type="Submit" value="Confirm Delete" name="submit"/>
				<br>
			</form>
		</center>
		
</body>
</html>
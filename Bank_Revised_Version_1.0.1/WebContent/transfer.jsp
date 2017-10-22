<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function customeridvalidation(){
	var cusid=document.getElementById("custid").value;
		var num=/^[0-9]+$/;
		if(cusid==""){
			alert("Please enter a customer ID");
			return false;
		}
		 if(!cusid.match(num)){
				alert("Please enter only numerics in cust ID");
				return false;
			}
		    if(cusid.length!=9){
				alert("Please enter a 9 digit cust ID");
				return false;
			}	
}</script>

</head>
<body>
	<h2 align="center">Transfer Money</h2><br><br>
<form action="TransferController" method="post" name="transferform" onsubmit="customeridvalidation()"  >
<table  align="center">
<tr>
			<th>CustomerId</th><td><input type="text" name="custid"></td>
		</tr>
		<tr>
			<th>Source Account Type</th>
			<td>
			<select name="source"> 
			<option value="select">Select</option>
			<option value="current">Current</option>
			<option value="savings">Savings</option>
			</select>
			</td>
		</tr>
		<tr>
			<th>Target Account Type</th>
			<td>
			<select name="target"> 
			<option value="select">Select</option>
			<option value="current">Current</option>
			<option value="savings">Savings</option>
			</select>
			</td>
		</tr>
		<tr>
			<th>Transfer Amount</th><td><input type="text" name="balance" onblur="isNAN()"></td>
			<tr >
		
		<td colspan="2" align ="center" ><input type="submit" name="updatebtn" value="submit" /></td>
		</tr>
		
		</table>
</form>
		

</body>
</body>
</html>
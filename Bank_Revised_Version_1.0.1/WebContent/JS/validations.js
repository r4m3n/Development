function loginValidation(){
	var sid=document.forms["loginform"]["username"].value;
	var pass=document.forms["loginform"]["password"].value;
	var num=/^[0-9]+$/;
	if(sid==""){
		alert("Please enter a user name");
		return false;
	}
	if(!sid.match(num)){
		alert("Please enter only numerics in SSN ID");
		return false;
	}
    /* if(sid.length!=9){
    	alert("Please enter 9 digits in SSN ID");
    	return false;
    } */
	if(pass == ""){
		alert("Please enter password ");
		return false;
	}
}


function createCustvalidation(){
	
	var sid=document.forms["form"]["ssnid"].value;
	var cname=document.forms["form"]["cname"].value;
	var age=document.forms["form"]["age"].value;
	var add=document.forms["form"]["add"].value;
	var city=document.forms["form"]["city"].value;
	var state=document.forms["form"]["state"].value;
	var num=/^[0-9]+$/;
	var letters=/^[A-Za-z\s]+$/;
	
	if(sid==""){
		alert("Please enter ssnid");
		return false;
	}
	 if(!sid.match(num)){
			alert("Please enter only numerics in ssnid");
			return false;
		}
	    if(sid.length!=9){
			alert("Please enter a 9 digit ssnid");
			return false;
		}
		 if(cname==""){
			alert("Please enter a Customer Name");
			return false;
		}
		 if(!isNaN(cname)){
				alert("Please enter alphabets in Customer Name");
				return false;
			}
		 if(!cname.match(letters)){
				alert("Please enter alphabets in Customer Name");
				return false;
			}
		 if(add==""){
				alert("Please enter a address");
				return false;
			}
			 
		 if(age==""){
				alert("Please enter an age");
				return false;
			}
			 if(isNaN(age)){
					alert("Please enter numeric value in age");
					return false;
				}
}


function customeridvalidation(){
	var cusid=document.getElementById("cusid").value;
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
}

function createAccountvalidation(){
	var cusid=document.getElementById("cusid1").value;
	var abal=document.getElementById("accbal").value;
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
	    if(abal==""){
	    	alert("Please enter some balance to deposit ");
	    	return false;
	    }
	    if(abal==0){
	    	alert("Please enter amount greater than zero");
	    	return false;
	    }
	    if(!abal.match(num)){
	    	alert("Please enter only numeric amount");
	    	return false;
	    }
	    
}

function amountValidation(){
	var abal=document.getElementById("amt").value;
	var num=/^[0-9]+$/;
	if(abal==""){
    	alert("Please enter some balance");
    	return false;
    }
    if(abal==0){
    	alert("Please enter amount greater than zero");
    	return false;
    }
    if(!abal.match(num)){
    	alert("Please enter only numeric amount");
    	return false;
    }
}

function accAmountValidation(){
	var abal=document.getElementById("accbal").value;
	var num=/^[0-9]+$/;
	if(abal==""){
    	alert("Please enter some balance to deposit ");
    	return false;
    }
    if(abal==0){
    	alert("Please enter amount greater than zero");
    	return false;
    }
    if(!abal.match(num)){
    	alert("Please enter only numeric amount");
    	return false;
    }
}


function miniStatementvalidation(){
	var accid=document.getElementById("accid").value;
	var sdate=document.getElementById("sdate").value;
	var edate=document.getElementById("edate").value;
	var num=/^[0-9]+$/;
	var dat=/^([0-9]{4})-([0-9]{2})-([0-9]{2})$/;
	if(accid==""){
		alert("Please enter a accountId ID");
		return false;
	}
	 if(!accid.match(num)){
			alert("Please enter only numerics in account id");
			return false;
		}
	    if(accid.length!=9){
			alert("Please enter only 9 digit in account");
			return false;
		}
	    if(sdate==""){
	    	alert("Please enter start date ");
	    	return false;
	    }
	    if(!sdate.match(dat)){
	    	alert("Enter date in ccyy-mm-dd format");
	    	return false;
	    }
	    if(edate ==""){
	    	alert("Please enter end date ");
	    	return false;
	    }
	    if(!edate.match(dat)){
	    	alert("Enter date in ccyy-mm-dd format");
	    	return false;
	    }
	    
}

function lastStatementValidation(){
	var accId=document.getElementById("accid").value;
	var trans=document.getElementById("limit").value;
	var num=/^[0-9]+$/;
	if(accId==""){
		alert("Please enter a accId ID");
		return false;
	}
	 if(!accId.match(num)){
			alert("Please enter only numerics in AccID");
			return false;
		}
	    if(accId.length!=9){
			alert("Please enter only 9 digit in accId");
			return false;
		}
	    if(trans == ""){
	    	alert("Please Enter some value to know the last number of transaction ");
	    	return false;
	    }
	    if(!trans.match(num)){
	    	alert("Please enter numeric number ");
	    	return false;
	    }	    
	    
}

function updateCustomerValidation(){
    var cusname = document.getElementById("cname").value;
    var addr = document.getElementById("add").value;
    var age = document.getElementById("age").value;
  var num=/^[0-9]+$/;
	var letters=/^[A-Za-z\s]+$/;
  if(cusname == ""){
  	alert("Please enter Customer Name ");
  	return false;
  }
  if(!cusname.match(letters)){
  	alert("Please enter only alphabets for customer name ");
  	return false;
  }
  if(addr==""){
		alert("Please enter a address");
		return false;
	}
  if(age==""){
		alert("Please enter an age");
		return false;
	}
	 if(isNaN(age)){
			alert("Please enter numeric value in age");
			return false;
		}
}


function empty()
{
	if(document.form.ssnId.value=="" || document.form.ssnId.value== null)
	{
		alert("SSN Id cannot be empty");
		return false;
	}
	if(document.form.custId.value=="" || document.form.custId.value== null)
	{
		alert("Customer Id cannot be empty");
		return false;
	}
	if(document.form.custName.value=="" || document.form.custName.value== null)
	{
		alert("Customer name cannot be empty");
		return false;
	}
	if(document.form.custAge.value=="" || document.form.custAge.value== null)
	{
		alert("Customer age cannot be empty");
		return false;
	}
	if(document.form.custAddress.value=="" || document.form.custAddress.value== null)
	{
		alert("Customer address cannot be empty");
		return false;
	}
}

function isNAN()
{
	if(isNaN(document.form.ssnId.value))
		alert("SSN Id has to be a number");
	
	if(isNaN(document.form.custId.value))
		alert("Customer Id has to be a number");
	
	if(isNaN(document.form.custAge.value))
		alert("Customer age has to be a number");
}

function chkssnId(){
	var ssnid=document.accountform.customerid.value;
	var letters=/^[0-9]+$/;
	if(ssnid!=null&&ssnid.length>0)
	{
			if(!letters.test(ssnid))
			{
					alert("only numeric values");
					return false;


			}
	}
	else{
		alert("please enter CustomerId");
	
		return false;	
		
	}


	var balance=document.accountform.amount.value;
	var letters=/^[0-9]+$/;
	if(balance!=null&&balance.length>0)
	{
			if(!letters.test(balance))
			{
					alert("only numeric values");
					return false;


			}
	}
	else{
		alert("please enter balance");
	
		return false;	
		
	}
}

function createCustvalidation1(){
	
	
	var cname=document.forms["form1"]["newcustname"].value;
	var age=document.forms["form1"]["newage"].value;
	var add=document.forms["form1"]["newaddress"].value;

	var num=/^[0-9]+$/;
	var letters=/^[A-Za-z\s]+$/;
	
	if(sid==""){
		alert("Please enter a SSN ID");
		return false;
	}
	 if(!sid.match(num)){
			alert("Please enter only numerics in SSN ID");
			return false;
		}
	    if(sid.length!=9){
			alert("Please enter a 9 digit SSN ID");
			return false;
		}
		 if(cname==""){
			alert("Please enter a Customer Name");
			return false;
		}
		 if(!isNaN(cname)){
				alert("Please enter alphabets in Customer Name");
				return false;
			}
		 if(!cname.match(letters)){
				alert("Please enter alphabets in Customer Name");
				return false;
			}
		 if(add==""){
				alert("Please enter a address");
				return false;
			}
			 if(city ==""){
		      if(!city.match(letters)){
				alert("Please enter alphabets in City");
				return false;
			}
			 }
			 if(state==""){
		 if(!state.match(letters)){
				alert("Please enter alphabets in state Name");
				return false;
			}
			 }
		 if(age==""){
				alert("Please enter an age");
				return false;
			}
			 if(isNaN(age)){
					alert("Please enter numeric value in age");
					return false;
				}
}
function validateForm() {
    var name = document.forms["form1"]["newcustname"].value;
    var age = document.forms["form1"]["newage"].value;
    var add = document.forms["form1"]["newaddress"].value;
    var num=/^[0-9]+$/;
	var letters=/^[A-Za-z\s]+$/;
    
    if (name == null || name == "") {
        alert("Name must be filled out");
        return false;
    }
    if(!isNaN(name)){
		alert("Please enter alphabets in Customer Name");
		return false;
	}
 if(! name.match(letters)){
		alert("Please enter alphabets in Customer Name");
		return false;
	}
 if(add==""){
		alert("Please enter a address");
		return false;
	}
	 
 if(age==""){
		alert("Please enter an age");
		return false;
	}
	 if(isNaN(age)){
			alert("Please enter numeric value in age");
			return false;
		}
}

/*var custid=document.updateForm.custid.value;
	var letters=/^[0-9]+$/;
	if(custid!=null&&custid.length>0)
	{
			if(!letters.test(custid))
			{
					alert("only numeric values");
					document.updateForm.ssnid.focus();
					return false;
			}
	}
	else{
		alert("please enter CUSTOMERID");
		document.updateForm.ssnid.focus();
		return false;	
		
	}
}
*/


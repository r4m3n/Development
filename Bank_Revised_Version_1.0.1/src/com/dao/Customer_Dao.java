package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.bean.CustomerPojo;
import com.util.DBTransaction;
public class Customer_Dao {
	
	Connection con= null;
	PreparedStatement ps= null;
	Statement st= null;
	ResultSet rs= null;
	CustomerPojo cp = new CustomerPojo();
	
	public void addCustomer(CustomerPojo c){
		
		String status="Active";
		String message="Account created successfully";
		
		
		
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
		
		
		
		try
		{
			
		con=DBTransaction.getConnection();
		ps= con.prepareStatement("insert into Customer_1098554 values(cust_sec.nextval,?,?,?,?,?,?,?,?,?,?)");
		
		ps.setInt(1, c.getSsnId());
		ps.setString(2, c.getCustName());
		ps.setInt(3, c.getCustAge());
		ps.setString(4, c.getCustAddress());
		ps.setString(5, c.getState());
		ps.setString(6, c.getCity());
		ps.setString(7, status);
		ps.setString(8, message);
		ps.setTimestamp(9, date);
		ps.setString(10, c.getPassword());
		int i=ps.executeUpdate();
		if(i>0){
			
			System.out.println("success");
		}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
	}
public CustomerPojo returnCustomerId(CustomerPojo cp){
	
	con=DBTransaction.getConnection();
	try{
		
	ps=con.prepareStatement("select max(custid) from customer_1098554");

	rs=ps.executeQuery();
	while(rs.next()){
		
		cp.setCustId(rs.getLong(1));
	}
	}
	catch(Exception e){
		
		e.printStackTrace();
	}
	
	return cp; 
}
}

package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.CustomerPojo;
import com.util.DBTransaction;

public class UpdateCustomerDao 
{
	PreparedStatement ps1=null;
	ResultSet rs=null;
	int i=0;
	Connection con=null;
	
	
	public int updateCustomer(Long userid,CustomerPojo cust4)
	{
		String msg= "updated successfully";
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
		
		con=DBTransaction.getConnection();
		String q="update customer_1098554 set name=?,address=?,age=?,message=?,last_updated=? where custid=?";
		
		try
		{
			ps1=con.prepareStatement(q);
			ps1.setString(1,cust4.getCustName());
			ps1.setString(2, cust4.getCustAddress());
			ps1.setInt(3, cust4.getCustAge());
			ps1.setString(4, msg);
			ps1.setTimestamp(5,date);
			ps1.setLong(6, userid);
			i=ps1.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}
	
	public ArrayList<CustomerPojo> viewDetailsForUpadte(Long userid)
	{
		con=DBTransaction.getConnection();
		CustomerPojo cust10=new CustomerPojo();
		ArrayList<CustomerPojo> custUpdateView=new ArrayList<CustomerPojo>();
		String q1="select * from customer_1098554 where custid=?";
		try
		{
			ps1=con.prepareStatement(q1);
			ps1.setLong(1, userid);
			rs=ps1.executeQuery();
			while(rs.next())
			{
				cust10.setCustId(rs.getLong(1));
				cust10.setSsnId(rs.getInt(2));
				cust10.setCustName(rs.getString(3));
				cust10.setCustAge(rs.getInt(4));
				cust10.setCustAddress(rs.getString(5));
				cust10.setState(rs.getString(6));
				cust10.setCity(rs.getString(7));
			}
			custUpdateView.add(cust10);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return custUpdateView;
	}
}
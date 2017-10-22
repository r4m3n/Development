
package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.CustomerPojo;
import com.util.DBTransaction;

public class DeleteCustomerDao 
{
	PreparedStatement ps1=null;
	PreparedStatement ps2=null;
	ResultSet rs=null;
	int i=0;
	Connection con=null;
	
	public int deleteCustomer(Long userid)
	{
		con=DBTransaction.getConnection();
		String q1="update customer_1098554 set status='Inactive',message='successfully deleted' where custid=?";
		String q2="update ACCOUNT_1098554 set account_status='Inactive',message='successfully deleted' where custid=?";
		System.out.println(userid);
		try
		{

			ps1=con.prepareStatement(q1);
			ps1.setLong(1,userid);
			ps2=con.prepareStatement(q2);
			ps2.setLong(1,userid);
			i=ps1.executeUpdate();
			ps2.execute();
			System.out.println("from delete Customer Dao i=.."+i);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
		
	}
	public ArrayList<CustomerPojo> viewDetailsForDelete(Long userid)
	{
		con=DBTransaction.getConnection();
		ArrayList<CustomerPojo> al1= new ArrayList<CustomerPojo>();
		CustomerPojo cp = new CustomerPojo();
				
		String q1="select * from customer_1098554 where custid=?";
		try
		{
			ps1=con.prepareStatement(q1);
			ps1.setLong(1, userid);
			rs=ps1.executeQuery();
			 while (rs.next())
			 {
				cp.setCustId(rs.getLong(1));
				cp.setSsnId(rs.getInt(2));
				cp.setCustName(rs.getString(3));
				cp.setCustAge(rs.getInt(4));
				cp.setState(rs.getString(5));
				cp.setCity(rs.getString(6));
				cp.setStatus(rs.getString(7));
				}
			 al1.add(cp);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return al1;
		
	}
	
	
}

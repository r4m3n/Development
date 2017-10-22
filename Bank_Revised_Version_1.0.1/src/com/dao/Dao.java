package com.dao;

import java.sql.*;
import java.util.ArrayList;
import com.bean.CustomerPojo;
import com.util.DBTransaction;

public class Dao 
{
	PreparedStatement pst=null;
	ResultSet rs;
	
	public void update(CustomerPojo c)throws SQLException,ClassNotFoundException
	{
		try
		{
			Connection con= DBTransaction.getConnection();
			pst=con.prepareStatement("update customer_1098554 set name=?,address=?,age=?,message=?,last_updated=? where ssnid=?");
			pst.setString(1, c.getCustName());
			pst.setString(2, c.getCustAddress());
			pst.setInt(3, c.getCustAge());
			//pst.setLong(4, c.getCustId());
			pst.setString(4, c.getMessage());
			pst.setDate(5,new java.sql.Date(c.getLastUpdated().getTime()));
			pst.setInt(6, c.getSsnId());
			pst.execute();
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public ArrayList<CustomerPojo> search(int s,long c)
	{
		ArrayList<CustomerPojo> list = new ArrayList<>();
		CustomerPojo pojo = new CustomerPojo();
		
		try
		{
			Connection con= DBTransaction.getConnection();
			pst=con.prepareStatement("select ssnid,custid,name,address,age from customer_1098554 where ssnid=? and custid=?");
			pst.setInt(1,s);
			pst.setLong(2,c);
			rs=pst.executeQuery();
			
			while(rs.next())
			{
				pojo.setSsnId(rs.getInt(1));
				pojo.setCustId(rs.getLong(2));
				pojo.setCustName(rs.getString(3));
				pojo.setCustAddress(rs.getString(4));
				pojo.setCustAge(rs.getInt(5));
			}
			
			list.add(pojo);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;	
	}
	
	public boolean validate(long id)
	{
		Boolean b=false;
		try
		{
			Connection con= DBTransaction.getConnection();
			pst=con.prepareStatement("select custid from customer_1098554");
			rs=pst.executeQuery();
			while(rs.next())
			{
				int i=rs.getInt(1);
				if(i==id)
				{
					b=true;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return b;
	}		
}
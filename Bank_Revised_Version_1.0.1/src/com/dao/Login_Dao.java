package com.dao;
import java.sql.*;
import com.bean.*;
import com.util.DBTransaction;
public class Login_Dao {
	
	PreparedStatement ps1=null;
	ResultSet rs=null;
	Connection con=null;
	
	
	public ResultSet custLogin(CustomerPojo c)
	{
		con=DBTransaction.getConnection();
		String q="select * from customer_1098554 where custid=? and status='Active' and password=?";
		
		try
		{
			ps1=con.prepareStatement(q);
			ps1.setLong(1, c.getCustId());
			ps1.setString(2, c.getPassword());
			rs=ps1.executeQuery();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet accountExecutiveLogin(ExecutiveLogin exLogin)
	{
		con=DBTransaction.getConnection();
		String q="select * from executive_1121480 where username=? and password=?";
		
		try
		{
			ps1=con.prepareStatement(q);
			ps1.setLong(1, exLogin.getExecutiveId());
			ps1.setString(2, exLogin.getPassword());
			rs=ps1.executeQuery();
		}catch(Exception d)
		{
			d.printStackTrace();
		}
		return rs;
		
	}
	
	public ResultSet cashlogin(CashierLogin cashierlog)
	{
		con=DBTransaction.getConnection();
		String q="select * from cashier_1121480 where username=? and password=?";
		
		try
		{
			ps1=con.prepareStatement(q);
			ps1.setLong(1, cashierlog.getCashierId());
			ps1.setString(2, cashierlog.getPassword());
			rs=ps1.executeQuery();
		}catch(Exception d)
		{
			d.printStackTrace();
		}
		return rs;
		
	}


}

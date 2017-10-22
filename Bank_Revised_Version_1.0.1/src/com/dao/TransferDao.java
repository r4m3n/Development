package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.Transfer;
import com.util.DBTransaction;

public class TransferDao 
{
	PreparedStatement pst=null;
	ResultSet rs=null;
	/*public double setSourcebalance(Transfer ob,double amount )
	
	{
		DBTransaction d= new DBTransaction();
		Connection con= d.getConnection();
		try
		{
		pst=con.prepareStatement("select balance from account_1098554 where custid=? and account_type=?");
		pst.setLong(1, ob.getCustid());
		pst.setString(2,ob.getSource());
		
		rs=pst.executeQuery();
		while (rs.next())
			{
				double d2=rs.getDouble(1);
				double d3=d2-amount;
				ob.setAmount(d3);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ob.getBalance();
}
public double setTargetbalance(Transfer ob,double amount )
	
	{
		DBTransaction d= new DBTransaction();
		Connection con= d.getConnection();
		try
		{
		pst=con.prepareStatement("select balance from account_1098554 where custid=? and account_type=?");
		pst.setLong(1, ob.getCustid());
		pst.setString(2,ob.getTarget());
		
		rs=pst.executeQuery();
		while (rs.next())
		{
			double d2=rs.getDouble(1);
			double d3=d2+amount;
			ob.setAmount(d3);
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ob.getBalance();*/
//}
public void updateSourcebalance(Transfer ob)

{
	DBTransaction d= new DBTransaction();
	Connection con= d.getConnection();
	try
	{
	pst=con.prepareStatement("update account_1098554 set balance=(select balance from account_1098554 where custid=? and account_type=?)-? where custid=? and account_type=? ");
	//pst.setDouble(1, (ob.gamount);
	pst.setLong(1,ob.getCustid());
	pst.setString(2,ob.getSource());
	pst.setDouble(3,ob.getAmount());
	pst.setLong(4,ob.getCustid());
	pst.setString(5,ob.getSource());
	
	
	
	pst.executeUpdate();
	
}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
public void updateTargetbalance(Transfer ob )

{
	DBTransaction d= new DBTransaction();
	Connection con= d.getConnection();
	try
	{
	pst=con.prepareStatement("update account_1098554 set balance=(select balance from account_1098554 where custid=? and account_type=?)+? where custid=? and account_type=? ");
	//pst.setDouble(1, (ob.gamount);
	pst.setLong(1,ob.getCustid());
	pst.setString(2,ob.getTarget());
	pst.setDouble(3, ob.getAmount());
	pst.setLong(4,ob.getCustid());
	pst.setString(5,ob.getTarget());
	
	
	
	pst.executeUpdate();
	
}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
public boolean validateSource(Transfer ob)
{
	
	
	DBTransaction d= new DBTransaction();
	Connection con= d.getConnection();
	try
	{
	pst=con.prepareStatement("select account_status from account_1098554 where custid=? and account_type=?");
	pst.setLong(1,ob.getCustid());
	pst.setString(2,ob.getSource());
	rs=pst.executeQuery();
	while(rs.next())
	{
		String s=rs.getString(1);
		if(s.equalsIgnoreCase("inactive"))
			return false;
	}
}catch(Exception e)
{
	e.printStackTrace();
}
	return true;
}
public boolean validateTarget(Transfer ob)
{
	
	
	DBTransaction d= new DBTransaction();
	Connection con= d.getConnection();
	try
	{
	pst=con.prepareStatement("select account_status from account_1098554 where custid=? and account_type=?");
	pst.setLong(1,ob.getCustid());
	pst.setString(2,ob.getTarget());
	rs=pst.executeQuery();
	while(rs.next())
	{
		String s=rs.getString(1);
		if(s.equalsIgnoreCase("inactive"))
			return false;
	}
}catch(Exception e)
{
	e.printStackTrace();
}
	return true;
}
public boolean balanceCheck(Transfer ob)
{
	DBTransaction d= new DBTransaction();
	Connection con= d.getConnection();
	try
	{
	pst=con.prepareStatement("select balance from account_1098554 where custid=? and account_type=?");
	pst.setLong(1,ob.getCustid());
	pst.setString(2,ob.getSource());
	rs=pst.executeQuery();
	while(rs.next())
		{
			double d3=rs.getDouble(1);
			if(d3<ob.getAmount())
				return false;
		}
	}
	catch(Exception e)
		{
			e.printStackTrace();
		}
	return true;
	}
public boolean validateCustomer(Transfer ob)
{
	DBTransaction d= new DBTransaction();
	Connection con= d.getConnection();
	try
	{
	pst=con.prepareStatement("select custid from account_1098554");
	rs=pst.executeQuery();
		while(rs.next())
		{
			long l=rs.getLong(1);
			if(l==ob.getCustid())
			return true;
			
		
		}
		}
	catch (Exception e) 
	{
	
	e.printStackTrace();
	}
	return false;
}
public void addTransactionsource(Transfer ob)
{
	try{
	DBTransaction d= new DBTransaction();
	Connection con= d.getConnection();
	pst=con.prepareStatement("insert into transaction_1098554 values(transacc_seq.nextval,?,?,?,(select account_id from account_1098554 where custid=? and account_type=?))");
	pst.setString(1,"transfer");
	java.sql.Timestamp  sqlDate = new java.sql.Timestamp(new java.util.Date().getTime());
    pst.setTimestamp(2, sqlDate);
    pst.setDouble(3, ob.getAmount());
    pst.setLong(4,ob.getCustid());
	pst.setString(5,ob.getSource());
	pst.executeUpdate();
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
}
public void addTransactiontarget(Transfer ob)
{
	try{
	DBTransaction d= new DBTransaction();
	Connection con= d.getConnection();
	pst=con.prepareStatement("insert into transaction_1098554 values(transacc_seq.nextval,?,?,?,(select account_id from account_1098554 where custid=? and account_type=?))");
	pst.setString(1,"transfer");
	java.sql.Timestamp  sqlDate = new java.sql.Timestamp(new java.util.Date().getTime());
    pst.setTimestamp(2, sqlDate);
    pst.setDouble(3, ob.getAmount());
    pst.setLong(4,ob.getCustid());
	pst.setString(5,ob.getTarget());
	pst.executeUpdate();
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
}
}
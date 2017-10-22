package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.util.DBTransaction;



public class TransactionDao {
	PreparedStatement pst=null;
	ResultSet rs=null;
public ResultSet search(long c)throws SQLException,ClassNotFoundException
	
	{
		try
		{
			DBTransaction d= new DBTransaction();
			Connection con= d.getConnection();
			pst=con.prepareStatement("select custid,account_id,account_type,balance from account_1098554 where account_id=?");
			pst.setLong(1, c);
			rs=pst.executeQuery();

		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return rs;
	}
public void deposit(double amount,long c)
{
	try{
	DBTransaction d= new DBTransaction();
	Connection con= d.getConnection();
	pst=con.prepareStatement("insert into transaction_1098554 values(transacc_seq.nextval,?,?,?,?)");
	pst.setString(1,"deposit");
	java.sql.Timestamp  sqlDate = new java.sql.Timestamp(new java.util.Date().getTime());
    pst.setTimestamp(2, sqlDate);
    pst.setDouble(3, amount);
    pst.setLong(4,c);
	pst.executeUpdate();
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
}
public void update(double amount,long id)
{
try{
	DBTransaction d= new DBTransaction();
	Connection con= d.getConnection();
	pst=con.prepareStatement("update account_1098554 set balance=(select balance from account_1098554 where account_id=?)+? where account_id=?");
	pst.setLong(1, id);
	pst.setDouble(2, amount);
	pst.setLong(3, id);
	pst.executeUpdate();
	
}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
public boolean validate(long id)

{
Boolean b=false;

	try
	{
		DBTransaction d= new DBTransaction();
	
	Connection con= d.getConnection();
	pst=con.prepareStatement("select account_id,account_status from account_1098554");
	rs=pst.executeQuery();
	while(rs.next())
	{
		long i=rs.getLong(1);
		String s=rs.getString(2);
		
		
		if(i==id && s.equalsIgnoreCase("active"))
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
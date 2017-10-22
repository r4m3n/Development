package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.DBTransaction;

public class WithdrawDao {
	
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
public void withdraw(double amount,long id)
{
	try{
	DBTransaction d= new DBTransaction();
	Connection con= d.getConnection();
	pst=con.prepareStatement("insert into transaction_1098554 values(transacc_seq.nextval,?,?,?,?)");
	pst.setString(1,"withdraw");
	java.sql.Timestamp  sqlDate = new java.sql.Timestamp(new java.util.Date().getTime());
    pst.setTimestamp(2, sqlDate);
    pst.setDouble(3, amount);
    pst.setLong(4, id);
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
	pst=con.prepareStatement("update account_1098554 set balance=(select balance from account_1098554 where account_id=?)-? where account_id=?");
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
public boolean validateBalance(double balance,long id)
{
	boolean flag=false;
	try{
		DBTransaction d= new DBTransaction();
		Connection con= d.getConnection();
		pst=con.prepareStatement("select balance from account_1098554 where account_id=?");
		pst.setLong(1, id);
		rs=pst.executeQuery();
		while(rs.next())
		{
			double d1=rs.getDouble(1);
			if(d1>=balance)
				flag=true;
		}
		
		
	}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	return flag;
}

}

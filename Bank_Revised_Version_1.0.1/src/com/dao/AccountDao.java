package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.bean.Account;
import com.util.DBTransaction;

public class AccountDao
{
	private static final String CURRENT_TIMESTAMP = null;
	PreparedStatement pst=null;
	ResultSet rs;
		public void createAccount(Account act,String type)throws SQLException,ClassNotFoundException
		
		{
			try
			{
				DBTransaction d= new DBTransaction();
				Connection con= d.getConnection();
				if(type.equalsIgnoreCase("savings"))
				{
				pst=con.prepareStatement("insert into  account_1098554 values(?,savacc_seq.nextval,?,?,?,?,?)");
				pst.setLong(1, act.getCustomerId());
				pst.setString(2, act.getAccountype());
				pst.setString(3, "active");
				//pst.setLong(4, c.getCustId());
				pst.setString(4,"success");
				java.sql.Timestamp  sqlDate = new java.sql.Timestamp(new java.util.Date().getTime());
			    pst.setTimestamp(5, sqlDate);
				pst.setDouble(6, act.getAmount());
				pst.execute();
				}
			
				if(type.equalsIgnoreCase("current"))
				{
					pst=con.prepareStatement("insert into  account_1098554 values(?,curacc_seq.nextval,?,?,?,?,?)");
					pst.setLong(1, act.getCustomerId());
					pst.setString(2, act.getAccountype());
					pst.setString(3, "active");
					//pst.setLong(4, c.getCustId());
					pst.setString(4,"success");
					java.sql.Timestamp  sqlDate = new java.sql.Timestamp(new java.util.Date().getTime());
				    pst.setTimestamp(5, sqlDate);
					pst.setDouble(6, act.getAmount());
					pst.execute();
				}
			}
				
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
		public boolean validate(long cid)
		{
			boolean b=false;
			try
			{
				DBTransaction d= new DBTransaction();
				Connection con= d.getConnection();
				pst=con.prepareStatement("select custid,status from customer_1098554");
				rs=pst.executeQuery();
				while(rs.next())
				{
					long i=rs.getLong(1);
					String status=rs.getString(2);
					
					
					
					if(i==cid && status.equalsIgnoreCase("active"))
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
		public ArrayList<String>  checkaccount(long custid)
		{
			ArrayList <String> al=new ArrayList<String>();
			try
			{
				DBTransaction d= new DBTransaction();
				Connection con= d.getConnection();
				pst=con.prepareStatement("select account_type from account_1098554 where custid=?");
				pst.setLong(1, custid);
				rs=pst.executeQuery();
				
				while(rs.next())
				{
					String s=rs.getString(1);
					al.add(s);
					
				}
					
					
					
					
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return al;
		}
		public long getid(long custid, String acc)
		{
			long l=0;
			try
			{
			DBTransaction d= new DBTransaction();
			Connection con= d.getConnection();
			pst=con.prepareStatement("select account_id from account_1098554 where custid=? and account_type=? ");
				pst.setLong(1, custid);
				pst.setString(2, acc);
			rs=pst.executeQuery();
			     while(rs.next())
			    {
				l=rs.getLong(1);
			    }
		    }catch(Exception e)
		    {
		    	e.printStackTrace();
		    }
			return l;
		}
		
		}

			

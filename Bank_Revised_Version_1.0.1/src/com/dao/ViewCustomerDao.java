package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.bean.CustomerPojo;
import com.util.DBTransaction;

public class ViewCustomerDao {
	
	PreparedStatement ps1=null;
	ResultSet rs=null;
	Connection con=null;

	
	public ArrayList<CustomerPojo> viewStatus() throws SQLException{
		ArrayList<CustomerPojo> al=new ArrayList<CustomerPojo>();
		Statement st=null;
	
		try{
			con=DBTransaction.getConnection();
			st=con.createStatement();
			rs=st.executeQuery("select custId,ssnId,status,message,last_updated from customer_1098554");
			while(rs.next()){
				CustomerPojo cs=new CustomerPojo();
				cs.setCustId(rs.getLong(1));
				cs.setSsnId(rs.getInt(2));
				cs.setStatus(rs.getString(3));
				cs.setMessage(rs.getString(4));
				cs.setLastUpdated(rs.getDate(5));
				al.add(cs);
				
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			//db.closeConnection();
			rs.close();
			st.close();
		}
		return al;
	}
	public ArrayList<CustomerPojo> viewDetails(long id) throws SQLException{
		ArrayList<CustomerPojo> al=new ArrayList<CustomerPojo>();
		Statement st=null;
		ResultSet rs=null;
		CustomerPojo c=new CustomerPojo();
		try{
			con=DBTransaction.getConnection();
			st=con.createStatement();
			rs=st.executeQuery("select name,age,address,state,city from customer_1098554 where custId="+id+"");
			while(rs.next())
			{
				c.setCustName(rs.getString(1));
				c.setCustAge(rs.getInt(2));
				c.setCustAddress(rs.getString(3));
				c.setState(rs.getString(4));
				c.setCity(rs.getString(5));
			}
			al.add(c);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			//db.closeConnection();
			rs.close();
			st.close();
		}
		return al;
	}
	
	
		public ResultSet selfViewCustomer(Long userid)
		{
			con=DBTransaction.getConnection();
			String q1="select * from customer_1098554 where custid=?";
			try
			{
				ps1=con.prepareStatement(q1);
				ps1.setLong(1, userid);
				rs=ps1.executeQuery();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			return rs;
		}

}

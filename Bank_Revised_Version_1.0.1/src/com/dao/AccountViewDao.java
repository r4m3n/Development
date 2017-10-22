package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bean.Account;
import com.util.DBTransaction;

public class AccountViewDao {
		public ArrayList<Account> viewMyStatus(long sid) throws SQLException{
			ArrayList<Account> al=new ArrayList<Account>();
			Statement st=null;
			ResultSet rs=null;
			DBTransaction db=new DBTransaction(); 
			try{
				
				Connection con=db.getConnection();
				st=con.createStatement();
				System.out.println(sid);
				rs=st.executeQuery("select * from account_1098554 where custid="+sid+"");
				while(rs.next()){
					
					Account cs=new Account();
				
					cs.setCustomerId(rs.getLong(1));
					cs.setAccountId(rs.getLong(2));
					cs.setAccountype(rs.getString(3));
					cs.setAcctstatus(rs.getString(4));
					cs.setMessage(rs.getString(5));
					cs.setDate(rs.getTimestamp(6));
					cs.setAmount(rs.getDouble(7));
					al.add(cs);
					
				}
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			finally{
				db.closeConnection();
				rs.close();
				st.close();
			}
			return al;
		}
}
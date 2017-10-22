package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.Account;
import com.util.DBTransaction;

public class CaccountDeleteDao {
	PreparedStatement pst = null;

	
	
	public boolean CaccountDelete(Account acc){
		
		DBTransaction d= new DBTransaction();
		Connection con= d.getConnection();
		boolean flag=false;
		try
		{
		pst=con.prepareStatement("update account_1098554 set account_status='Inactive' where custid=? and account_id=? and account_status=?");
		pst.setLong(1,acc.getCustomerId());
		pst.setLong(2,acc.getAccountId());
		pst.setString(3, "Active");
		int i = pst.executeUpdate();
		if(i>0){
			flag=true;
			}
		
	}
		catch(SQLException e){
			
		e.printStackTrace();
		}
		
	
		return flag;

}
}
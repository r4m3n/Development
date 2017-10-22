package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.util.DBTransaction;
import com.bean.CustomerPojo;

public class CustomerDao 
{
	@SuppressWarnings("unused")
	public boolean del(CustomerPojo cp) throws SQLException,NullPointerException
	{
		Connection con= DBTransaction.getConnection();
		String sql = "UPDATE CUSTOMER_1098554 SET status = 'inactive',message='successfully deleted' WHERE custId=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setLong(1, cp.getCustId());
		
		
		int flag = stmt.executeUpdate();
	
		
		if(flag==1)
			return true;
		else
			return false;
	}
}
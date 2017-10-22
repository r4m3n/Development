package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.util.DBTransaction;
import com.bean.ExecutiveDeletePojo;

public class ExecutiveDeleteDao 
{
	public boolean delExecutiveDao(ExecutiveDeletePojo deletePojo) throws SQLException
	{
		DBTransaction db = new DBTransaction();
		
		Connection con = db.getConnection();
		String sql = "UPDATE ACCOUNT_1098554 SET account_status = 'inactive',message='successfully deleted' WHERE account_id=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setLong(1, deletePojo.getAccountId());
		
	/*	String queString = "UPDATE CUSTOMER_1193891 SET status = 'inactive' WHERE username=?";
		PreparedStatement statement = con.prepareStatement(queString);
		statement.setInt(1, deletePojo.getAccountId());*/
		
		int flag = stmt.executeUpdate();
		//int flag1 = statement.executeUpdate();
		
		if(flag==1)// && flag1==1)
			return true;
		else
			return false;
	}
}
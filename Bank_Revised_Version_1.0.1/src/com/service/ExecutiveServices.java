package com.service;

import java.sql.SQLException;
import com.bean.ExecutiveDeletePojo;
import com.dao.ExecutiveDeleteDao;

public class ExecutiveServices 
{
	public boolean delExecutive(ExecutiveDeletePojo deletePojo)throws SQLException
	{
		ExecutiveDeleteDao dao = new ExecutiveDeleteDao();
		boolean b = dao.delExecutiveDao(deletePojo);
		return b;
	}
}
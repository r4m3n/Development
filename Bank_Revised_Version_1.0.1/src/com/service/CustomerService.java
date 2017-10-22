package com.service;

import java.sql.SQLException;

import com.bean.CustomerPojo;
import com.dao.CustomerDao;


public class CustomerService 
{
	public boolean delCustomer(CustomerPojo cp) throws SQLException
	{
		// TODO Auto-generated method stub
		CustomerDao cd = new CustomerDao();
		boolean b = cd.del(cp);
		return b;
	}
}
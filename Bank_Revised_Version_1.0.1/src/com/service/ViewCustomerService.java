package com.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.CustomerPojo;
import com.dao.ViewCustomerDao;

public class ViewCustomerService 
{
	ResultSet rs=null;
	ViewCustomerDao vDao=new ViewCustomerDao();
	public ResultSet callSelfViewCustomer(Long userId)
	{
		rs=vDao.selfViewCustomer(userId);
		return rs;
	}
	
	public ArrayList<CustomerPojo> callEviewCustomer()
	{
		ViewCustomerDao csdao=new ViewCustomerDao();
		ArrayList<CustomerPojo> al=new ArrayList<CustomerPojo>();
		try {
			al = csdao.viewStatus();
			
		} catch (SQLException e) 
		{
		
			e.printStackTrace();
		}
		return al;
	}
	
}

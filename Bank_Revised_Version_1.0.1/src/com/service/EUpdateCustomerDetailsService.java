package com.service;

import com.bean.CustomerPojo;
import com.dao.Dao;

public class EUpdateCustomerDetailsService 
{
	public void callEupdateCustomerMethod(CustomerPojo c)
	{
		Dao d=new Dao();
		try
		{
		d.update(c);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
}

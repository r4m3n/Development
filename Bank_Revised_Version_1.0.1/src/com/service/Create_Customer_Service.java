package com.service;


import com.bean.CustomerPojo;
import com.dao.Customer_Dao;

public class Create_Customer_Service {
	
	
	public void addCustomer(CustomerPojo c)
	{
		Customer_Dao dao=new Customer_Dao();
		dao.addCustomer(c);
	}
	
	public CustomerPojo returnCid (CustomerPojo cp){
		
		Customer_Dao dao=new Customer_Dao();
		return dao.returnCustomerId(cp);
		
	}
}

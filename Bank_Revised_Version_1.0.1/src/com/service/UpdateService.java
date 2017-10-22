package com.service;

import java.util.ArrayList;
import com.bean.CustomerPojo;
import com.dao.Dao;
import com.dao.UpdateCustomerDao;

public class UpdateService 
{
	UpdateCustomerDao updatedao=new UpdateCustomerDao();
	Dao dao = new Dao();
	CustomerPojo cust9=new CustomerPojo();
	int res=0;
	ArrayList<CustomerPojo> list = new ArrayList<>();

	public int callUpdateCustomer(Long userid,CustomerPojo cust3)
	{
		res=updatedao.updateCustomer(userid,cust3);
		return res;
	}
	
	public ArrayList<CustomerPojo> callUpdateDaoForDetails(Long userid)
	{
		ArrayList<CustomerPojo> cust9=new ArrayList<CustomerPojo>();
		cust9=updatedao.viewDetailsForUpadte(userid);
		return cust9;
	}

	public Boolean callValidate(long custid) 
	{
		boolean b = dao.validate(custid);
		return b;
	}

	public ArrayList<CustomerPojo> callSearch(int ssnid, long custid) 
	{
		list = dao.search(ssnid, custid);
		return list;
	}
}
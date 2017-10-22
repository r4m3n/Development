package com.service;
import java.util.ArrayList;
import com.bean.CustomerPojo;
import com.dao.DeleteCustomerDao;

public class DeleteServices
{
	DeleteCustomerDao deletedao=new DeleteCustomerDao();
	ArrayList<CustomerPojo> delAl = new ArrayList<CustomerPojo>();
	int res=0;
	
	public int callDeleteCustomer(Long userid)
	{
		res = deletedao.deleteCustomer(userid);
		return res;
	}
	
	public ArrayList<CustomerPojo> callDeleteDaoForDetails(Long userid)
	{
		delAl = deletedao.viewDetailsForDelete(userid);
		return delAl;
	}

	
}

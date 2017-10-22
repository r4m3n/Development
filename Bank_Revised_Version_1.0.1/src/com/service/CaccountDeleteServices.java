package com.service;

import com.bean.Account;
import com.dao.CaccountDeleteDao;

public class CaccountDeleteServices {
	
	
	public boolean CaccountDelete(Account acc){
	
		CaccountDeleteDao cd = new CaccountDeleteDao();
		return cd.CaccountDelete(acc);
		
	}

}

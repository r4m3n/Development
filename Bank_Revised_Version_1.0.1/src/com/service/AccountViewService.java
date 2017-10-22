package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import com.bean.Account;
import com.dao.AccountViewDao;

public class AccountViewService {
	public ArrayList<Account> viewMyStatus(long sid){
		AccountViewDao d=new AccountViewDao();
		ArrayList<Account> al=new ArrayList<Account>();
		try {
			al=d.viewMyStatus(sid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
		
	}
}




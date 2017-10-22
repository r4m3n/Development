package com.service;

import java.sql.ResultSet;

import com.bean.CashierLogin;
import com.bean.CustomerPojo;
import com.bean.ExecutiveLogin;
import com.dao.Login_Dao;

public class Login_Service {

	
	Login_Dao ld=new Login_Dao();
	ResultSet rs1=null;

	public ResultSet callCustLog(CustomerPojo custLogin)
	{
		rs1=ld.custLogin(custLogin);
		return rs1;
	}
	public ResultSet callExecutiveLog(ExecutiveLogin exlogin)
	{
		rs1=ld.accountExecutiveLogin(exlogin);
		return rs1;
	}
	
	public ResultSet callCashierLog(CashierLogin cashierlogin)
	{
		rs1=ld.cashlogin(cashierlogin);
		return rs1;
	}
	
	

}
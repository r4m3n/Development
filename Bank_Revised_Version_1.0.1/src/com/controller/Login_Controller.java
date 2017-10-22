package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.CashierLogin;
import com.bean.CustomerPojo;

import com.bean.ExecutiveLogin;
import com.service.Login_Service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.Customer_Dao;

@WebServlet("/Login_Controller")
public class Login_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
 ResultSet r1=null;
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		String tablename=request.getParameter("select");
		Long username=Long.parseLong(request.getParameter("username"));
		String password=request.getParameter("password");
	
		HttpSession session=request.getSession();
		
		CustomerPojo cust=new CustomerPojo();
		ExecutiveLogin executive=new ExecutiveLogin();
		CashierLogin cashier=new CashierLogin();
		
		System.out.println(tablename);
		System.out.println(username);
		System.out.println(password);
		
		Login_Service ls=new Login_Service();
	if(tablename != null && username == null || password==null)
	{
		response.sendRedirect("login.jsp");
	}
	else
	{
		if(tablename.equals("Customer"))
		{
			cust.setCustId(username);
			cust.setPassword(password);
			try
			{
			r1=ls.callCustLog(cust);
				if(r1.next())
				{
					session.putValue("uname", username);
					session.putValue("pass", password);
					response.sendRedirect("CustomerHomePage.jsp");
				}
				else
				{
					response.sendRedirect("failLogin.jsp");
				}
			}catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("from login servlet customer login");
			}
			
		}
		else if(tablename.equals("Executive"))
		{
			executive.setExecutiveId(username);
			executive.setPassword(password);
			try
			{
			r1=ls.callExecutiveLog(executive);
				if(r1.next())
				{
					session.putValue("uname", username);
					session.putValue("pass", password);
					response.sendRedirect("ExecutiveHomePage.jsp");
				}
				else
				{
					response.sendRedirect("failLogin.jsp");
				}
				
			}catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("from login servlet executive login");
			}
			
		}
		else if(tablename.equals("Cashier"))
		{
			cashier.setCashierId(username);
			cashier.setPassword(password);
			try
			{
			r1=ls.callCashierLog(cashier);
			if(r1.next())
			{
				session.putValue("uname", username);
				session.putValue("pass", password);
				response.sendRedirect("CashierHomePage.jsp");
				}
			else
			{
				response.sendRedirect("failLogin.jsp");
			}
			}catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("from login servlet Cashier login");
			}
		}
		else
		{
			System.out.println("wrong tablename");
		}
	}
}
}
		
		
		



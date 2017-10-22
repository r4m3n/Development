package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Account;
import com.bean.CustomerPojo;
import com.service.CaccountDeleteServices;

/**
 * Servlet implementation class CustomerDelAccController
 */
@WebServlet("/CustomerDelAccController")
public class CustomerDelAccController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerDelAccController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long custid=Long.parseLong(request.getParameter("customerid"));
		Long accid=Long.parseLong(request.getParameter("accountid"));
		Account acc = new Account();
		acc.setAccountId(accid);
		acc.setCustomerId(custid); 
		
	CaccountDeleteServices cd= new CaccountDeleteServices();
	boolean b = false;
	
	try{
	
		b=cd.CaccountDelete(acc);
		
		if(b==true){
		response.sendRedirect("success.jsp");	
		}
		else{
			
			response.sendRedirect("fail.jsp");
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		
			}

}

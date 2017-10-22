package com.controller;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.CustomerService;
import com.service.DeleteServices;
import com.bean.CustomerPojo;



@WebServlet("/deleteController")
public class EdeleteCustomerDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
	
		
		response.setContentType("text/html");
		
		CustomerPojo cp = new CustomerPojo();
		ArrayList<CustomerPojo> al= new ArrayList<CustomerPojo>();
		
		Long custId=Long.parseLong(request.getParameter("custId"));
		
			DeleteServices dps=new DeleteServices();
			try
			{
				al=dps.callDeleteDaoForDetails(custId);
				request.setAttribute("resultsetFromDeleteCustomer1", al);
				request.getRequestDispatcher("edeletecustomer.jsp").forward(request, response);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

	}
		
		
	
		
	
		
	
}
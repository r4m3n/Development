package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bean.CustomerPojo;
import com.dao.ViewCustomerDao;
import com.service.ViewCustomerService;

@WebServlet("/ViewController")
public class ViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request,response);
		}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String action=(String)request.getParameter("action");
		ViewCustomerService vcs=new ViewCustomerService();
		ArrayList<CustomerPojo> a1list=new ArrayList<CustomerPojo>();
		if(action.equals("view"))
		{
			a1list=vcs.callEviewCustomer();
			request.setAttribute("csList1",a1list);
			
			request.getRequestDispatcher("CustomerStatus.jsp").forward(request, response);
		
		}
	}

}

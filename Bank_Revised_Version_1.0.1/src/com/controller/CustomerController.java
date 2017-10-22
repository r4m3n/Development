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

@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String action=(String)request.getParameter("action");
		String ID = request.getParameter("id");
		long id=Long.parseLong(ID);
		System.out.println(Integer.parseInt(ID));
		
		
		if(action.equals("show"))
		{
			System.out.println("hi");
			ViewCustomerDao csdao=new ViewCustomerDao();
			ArrayList<CustomerPojo> al=new ArrayList<CustomerPojo>();
			try {
				System.out.println(id);
				al=csdao.viewDetails(id);
				
				request.setAttribute("csList",al);
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			
			request.getRequestDispatcher("CustomerDetails.jsp").forward(request, response);
		
		}
	}

}

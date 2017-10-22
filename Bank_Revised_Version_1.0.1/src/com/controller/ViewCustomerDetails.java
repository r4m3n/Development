package com.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.UpdateService;
import com.service.ViewCustomerService;

@WebServlet("/ViewCustomerDetails")
public class ViewCustomerDetails extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
		}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String action=(String)request.getParameter("action");
		if(action.equals("cview"))
		{
		HttpSession ses=request.getSession(true);
		Long userId=(Long)ses.getValue("uname");
		System.out.println("In Customer Service:"+userId);
		ResultSet rs7=null;
		ViewCustomerService service=new ViewCustomerService();
		
		try
		{
		rs7=service.callSelfViewCustomer(userId);
		
		request.setAttribute("resultsetFromViewCustomerController", rs7);
		request.getRequestDispatcher("SelfView.jsp").forward(request, response);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
		}
	}

}

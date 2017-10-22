package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.bean.CustomerPojo;
import com.service.UpdateService;
@WebServlet("/CustomerUpdateController")
public class CustomerUpdateController extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("welcome");
		HttpSession ses=request.getSession(true);
		Long user=(Long)ses.getValue("uname");
		int updateFlag=0;
		CustomerPojo cust1=new CustomerPojo();
		
		String newName=(String)request.getParameter("newcustname");
		String newaddress=(String)request.getParameter("newaddress");
		int newAge=Integer.parseInt(request.getParameter("newage"));
		
		
		cust1.setCustName(newName);
		cust1.setCustAddress(newaddress);
		cust1.setCustAge(newAge);
		
		
		UpdateService updateservice=new UpdateService();
		updateFlag=updateservice.callUpdateCustomer(user, cust1);
		
		if(updateFlag==1)
		{
			response.sendRedirect("success.jsp");
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
	}
}

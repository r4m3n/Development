package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.bean.CustomerPojo;
import com.service.DeleteServices;

@WebServlet("/DeleteContollerForCustomer")
public class DeleteContollerForCustomer extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action = (String)request.getParameter("action");
		HttpSession ses = request.getSession(true);
		Long user = (Long)ses.getValue("uname");
		DeleteServices dps = new DeleteServices();
		ArrayList<CustomerPojo> delAl = new ArrayList<CustomerPojo>();
		
		if(action.equals("cdelete"))
		{
			
			delAl = dps.callDeleteDaoForDetails(user);
			System.out.println("Welcome... after TRY.. :P xD");
			for(CustomerPojo c : delAl)
			{
				System.out.println(c.getCity());
				System.out.println(c.getCustAddress());
			}
				
			request.setAttribute("arraylistFromDeleteCustomer", delAl);
			request.getRequestDispatcher("DeleteCustomerSelfJspPage.jsp").forward(request, response);
		}
	}
}
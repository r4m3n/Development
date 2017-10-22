package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.service.ExecutiveServices;
import com.bean.ExecutiveDeletePojo;

@WebServlet("/ExecutiveDeleteController")
public class ExecutiveDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ExecutiveDeleteController() {
        super();   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		ExecutiveDeletePojo deletePojo = new ExecutiveDeletePojo();
		
		deletePojo.setAccountId(Integer.parseInt(request.getParameter("accId")));
		deletePojo.setAccountType(request.getParameter("accType"));
		
		ExecutiveServices services = new ExecutiveServices();
		
		try
		{
			boolean b = services.delExecutive(deletePojo);
			
			if (b == true)
				response.sendRedirect("success.html");
			else
				response.sendRedirect("fail.html");
		}
		
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
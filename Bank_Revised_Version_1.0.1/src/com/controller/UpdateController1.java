package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bean.CustomerPojo;
import com.service.UpdateService;

@WebServlet("/UpdateController1")
public class UpdateController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		ArrayList<CustomerPojo> list = new ArrayList<>();
		long custid=Long.parseLong(request.getParameter("custid"));
		int ssnid=Integer.parseInt(request.getParameter("ssnid"));
		UpdateService service = new UpdateService();
		System.out.println("Yo u r in UpdateController 1.. havefun hf.. :P xD");
		
		try
		{
			Boolean b = service.callValidate(custid);
	
			if(b==true)
			{
				list = service.callSearch(ssnid,custid);
				request.setAttribute("executiveUpdateArrayList", list);
				request.getRequestDispatcher("updateFinal.jsp").forward(request, response);
			}
			
			else
			{
				PrintWriter out=response.getWriter();
				out.print("Sorry UserName or Password Error!");  
				request.getRequestDispatcher("update.jsp").include(request, response);
			}	
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
package com.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.service.DeleteServices;
@WebServlet("/DeleteCustomer")
public class DeleteCustomer extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	DeleteServices ds=new DeleteServices();
	int deleteflag=0;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession ses=request.getSession(true);
		Long userid=(Long)ses.getValue("uname");
		System.out.println("from delete customer " + userid);
		DeleteServices deleteservice=new DeleteServices();
		deleteflag=deleteservice.callDeleteCustomer(userid);
		
		if(deleteflag==1)
			response.sendRedirect("login.jsp");
		else
			response.sendRedirect("error.jsp");
	}
}
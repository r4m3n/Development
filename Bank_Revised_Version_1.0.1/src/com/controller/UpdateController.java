package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bean.CustomerPojo;
import com.service.EUpdateCustomerDetailsService;

@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		long custid=Long.parseLong(request.getParameter("custid"));
		int ssnid=Integer.parseInt(request.getParameter("ssnid"));
		String name=(String)request.getParameter("newcustname");
		String address=(String)request.getParameter("newaddress");
		int age=Integer.parseInt(request.getParameter("newage"));
		
		Calendar cal = Calendar.getInstance();
		Date date=cal.getTime();
		String s="success";
		CustomerPojo c=new CustomerPojo();
		
		c.setCustId(custid);
		c.setSsnId(ssnid);
		c.setCustName(name);
		c.setCustAddress(address);
		c.setCustAge(age);
		c.setMessage(s);
		c.setLastUpdated(date);
		boolean flag=false;
		
		EUpdateCustomerDetailsService eupdate=new EUpdateCustomerDetailsService();
		try
		{
			eupdate.callEupdateCustomerMethod(c);
			flag=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		if(flag==true)
		{
			PrintWriter out=response.getWriter();
			//Calendar cal1=Calendar.getInstance();
			String s1 = cal.getTime().toString();
			out.println("<body>");
			out.println("updated succesfully on "+s1);
		}
	}
}
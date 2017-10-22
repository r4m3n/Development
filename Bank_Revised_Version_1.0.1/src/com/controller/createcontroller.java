package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Account;
import com.dao.AccountDao;

/**
 * Servlet implementation class createcontroller
 */
@WebServlet("/createcontroller")
public class createcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String custid=request.getParameter("customerid");
		long custid1 =Long.parseLong(custid);
		System.out.println(custid1);
		String acctype=request.getParameter("accounttype");
		String balance1=(request.getParameter("balance"));
		double balance=Double.parseDouble(balance1);
		Calendar cal=Calendar.getInstance();
		Date date=cal.getTime();
		Account ac= new Account();
		ac.setCustomerId(custid1);
		ac.setAccountype(acctype);
		ac.setAmount(balance);
		ac.setDate(date);
		try
		{
			AccountDao acd=new AccountDao();
			
			boolean b=acd.validate(custid1);
			
			if(b==true)
			{
				ArrayList<String> c=acd.checkaccount(custid1);
				for(String s:c)
				{
					if(s.equalsIgnoreCase(acctype))
					{
						PrintWriter out=response.getWriter();
						/*out.print("wrong accountype selected!!!");  
						request.getRequestDispatcher("home.jsp").include(request, response);
						*/b=false;
						out.println("<script type=\"text/javascript\">");
						   out.println("alert('wrong accountype selected!!!');");
						   out.println("location='CustomerHomePage.jsp';");
						   out.println("</script>");
						
					}
					
					
					
				}
				if(b==true)
				{
				acd.createAccount(ac,acctype);
				long aid=acd.getid(custid1, acctype);

				request.setAttribute("aid", aid);
				request.getRequestDispatcher("AccountCreationsuccess.jsp").forward(request, response);
				
				}
			}
			else
			{
				PrintWriter out=response.getWriter();
				out.println("<script type=\"text/javascript\">");
				   out.println("alert('wrong id!!!');");
				   out.println("location='CcreateAccount.jsp';");
				   out.println("</script>");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub
	}

}

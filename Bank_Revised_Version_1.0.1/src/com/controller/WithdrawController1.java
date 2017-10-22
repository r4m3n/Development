package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TransactionDao;
import com.dao.WithdrawDao;

/**
 * Servlet implementation class WithdrawController1
 */
@WebServlet("/WithdrawController1")
public class WithdrawController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WithdrawController1() {
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
		// TODO Auto-generated method stub
		long id=Long.parseLong(request.getParameter("accountid"));
		double amount=Double.parseDouble(request.getParameter("depositammount"));
		WithdrawDao wrd=new WithdrawDao();
		try
		{
			boolean b=wrd.validateBalance(amount, id);
			if(b==true){
				
			
			
		
		wrd.withdraw(amount,id);
		wrd.update(amount, id);
		response.sendRedirect("success.jsp");
			}
			else 
			{
				PrintWriter out=response.getWriter();
				out.println("<script type=\"text/javascript\">");
				   out.println("alert('insufficient balance!!!');");
				   out.println("location='withdrawhome.jsp';");
				   out.println("</script>");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
	}

	}



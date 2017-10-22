package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TransactionDao;

/**
 * Servlet implementation class TransactionController
 */
@WebServlet("/TransactionController")
public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionController() {
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
		long id=Long.parseLong(request.getParameter("accountid"));
		TransactionDao td=new TransactionDao();
		try{
			boolean b=td.validate(id);
			if(b==true)
			{
			ResultSet rs=td.search(id);

			request.setAttribute("resultset", rs);
			request.getRequestDispatcher("Deposit.jsp").forward(request, response);
			}
			else
			{
				PrintWriter out=response.getWriter();
				out.println("<script type=\"text/javascript\">");
				   out.println("alert('wrong id selected!!!');");
				   out.println("location='transhome.jsp';");
				   out.println("</script>");
			}
			//request.setAttribute("id", id);
			//request.getRequestDispatcher("TransactionController1.java").forward(request, response);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

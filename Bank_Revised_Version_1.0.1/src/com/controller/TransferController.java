package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Transfer;
import com.dao.TransferDao;

/**
 * Servlet implementation class TransferController
 */
@WebServlet("/TransferController")
public class TransferController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransferController() {
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
		long custid=Long.parseLong(request.getParameter("custid"));
		String source=request.getParameter("source");
		String target=request.getParameter("target");
		double amount=Double.parseDouble(request.getParameter("balance"));
		Transfer ob= new Transfer();
		ob.setCustid(custid);
		ob.setSource(source);
		ob.setTarget(target);
		ob.setAmount(amount);
		TransferDao td=new TransferDao();
		if(!(source.equalsIgnoreCase(target)))
		{
		try
		{
			//double sb=td.setSourcebalance(ob,amount);
			//double tb=td.setTargetbalance(ob,amount);
			boolean b=td.validateCustomer(ob);
			System.out.println(b);
			boolean b1=td.validateSource(ob);
			boolean b2=td.validateTarget(ob);
			boolean b3=td.balanceCheck(ob);
			if(b)
			{
				if(b1 && b2)
				{
					if(b3)
					{
			
						td.updateSourcebalance(ob);
						td.updateTargetbalance(ob);
						td.addTransactionsource(ob);
						td.addTransactiontarget(ob);
						response.sendRedirect("success.jsp");
					}
					else
					{
						PrintWriter out=response.getWriter();
						out.println("<script type=\"text/javascript\">");
						out.println("alert('insufficient balance in account!!!');");
						out.println("location='transfer.jsp';");
						out.println("</script>");
					}
				}
				else
				{
					PrintWriter out=response.getWriter();
					out.println("<script type=\"text/javascript\">");
					out.println("alert('inactive account!!!');");
					out.println("location='transfer.jsp';");
					out.println("</script>");
				}
			
			}
			else
			{
				PrintWriter out=response.getWriter();
				out.println("<script type=\"text/javascript\">");
				out.println("alert('invalid customer id!!!');");
				out.println("location='transfer.jsp';");
				out.println("</script>");
			}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		else{
			PrintWriter out=response.getWriter();
			out.println("<script type=\"text/javascript\">");
			   out.println("alert('select different type of account!!!');");
			   out.println("location='transfer.jsp';");
			   out.println("</script>");
			
		}
		
		
		
		// TODO Auto-generated method stub
	}

}

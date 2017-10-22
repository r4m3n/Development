package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Account;
import com.service.AccountViewService;

/**
 * Servlet implementation class CustomerAccountView
 */
@WebServlet("/CustomerAccountView")
public class CustomerAccountView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerAccountView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Account> aclist=new ArrayList<Account>();
		String action=request.getParameter("action");
		HttpSession ses = request.getSession();
		Long user=(Long)ses.getValue("uname");
		if(action.equals("view"))
		{
		
			AccountViewService aserv=new AccountViewService();
			System.out.println(user);
			aclist=aserv.viewMyStatus(user);
			request.setAttribute("cuslist", aclist);
			request.getRequestDispatcher("AccountStatus.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

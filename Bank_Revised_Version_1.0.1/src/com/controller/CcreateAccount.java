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
import com.service.UpdateService;


@WebServlet("/CcreateAccount")
public class CcreateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
		}
	

    public CcreateAccount() {
        super();
      
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=(String)request.getParameter("action");
		if(action.equals("cacc")){
				
				HttpSession ses=request.getSession(true);
				Long user=(Long)ses.getValue("uname");
				System.out.println("from update details controller"+user);
				UpdateService ups=new UpdateService();
				ArrayList<CustomerPojo> cust8=new ArrayList<CustomerPojo>();
				try
				{
					cust8=ups.callUpdateDaoForDetails(user);
					
					request.setAttribute("resultsetFromUpdateCustomer",cust8);
					request.getRequestDispatcher("CcreateAccount.jsp").forward(request, response);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
		}
			
			
	}
		
		
	}


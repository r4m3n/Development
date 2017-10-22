package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.CustomerPojo;
import com.service.DeleteServices;


@WebServlet("/EdeleteCustomerDetailsController1")
public class EdeleteCustomerDetailsController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DeleteServices ds=new DeleteServices();
	int deleteflag=0;

    public EdeleteCustomerDetailsController1() {
        super();
       
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		CustomerPojo cp= new CustomerPojo();
		
		Long userid=Long.parseLong(request.getParameter("custid"));
	
		DeleteServices deleteservice=new DeleteServices();
		deleteflag=deleteservice.callDeleteCustomer(userid);
		
		if(deleteflag==1)
		{
			response.sendRedirect("success.html");
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
	}

		
	}



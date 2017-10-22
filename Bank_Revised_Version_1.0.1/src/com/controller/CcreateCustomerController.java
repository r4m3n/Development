package com.controller;

import java.io.IOException; 

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CustomerPojo;
import com.service.Create_Customer_Service;

@WebServlet("/Executive_Controller")
public class CcreateCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


			CustomerPojo cust= new CustomerPojo();
			cust.setSsnId(Integer.parseInt(request.getParameter("ssnid")));
			cust.setCustName(request.getParameter("cname"));
			cust.setCustAddress(request.getParameter("add"));
			cust.setCustAge(Integer.parseInt(request.getParameter("age")));
			cust.setState(request.getParameter("state"));
			cust.setCity(request.getParameter("city"));
			cust.setPassword(request.getParameter("pwd"));
			Create_Customer_Service ccs= new Create_Customer_Service();
			Boolean b = false;
			try{
				
				ccs.addCustomer(cust);
				CustomerPojo cust1=ccs.returnCid(cust);
				 b = true;
				if(b==true){
					request.setAttribute("cid", cust1);
					System.out.println(cust1.getCustId());
					request.getRequestDispatcher("CregisterSuccess.jsp").forward(request, response); 
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}

}

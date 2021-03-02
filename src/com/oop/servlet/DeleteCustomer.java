package com.oop.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.*;
import com.oop.service.CustomerServiceImpl;
import com.oop.service.VideoServiceImpl;

@WebServlet("/DeleteCustomer")
public class DeleteCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DeleteCustomer() {
        super();
    } 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Customer cus=new Customer();
		cus.setNIC(request.getParameter("NIC"));
		
		CustomerServiceImpl CustomerService=new CustomerServiceImpl();
		CustomerService.DeleteCustomer(cus);
	
		response.sendRedirect("CustomerDatails.jsp");
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
			

			
	}

}

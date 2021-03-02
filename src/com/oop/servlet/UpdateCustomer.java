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

import com.oop.model.Customer;
import com.oop.service.CustomerServiceImpl;


@WebServlet("/UpdateCustomer")
public class UpdateCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public UpdateCustomer() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
		Customer cus=new Customer();
		cus.setNIC(request.getParameter("NIC"));
		cus.setName(request.getParameter("Name"));
		cus.setEmail(request.getParameter("Email"));
		cus.setTelephone(request.getParameter("Telephone"));
		
		CustomerServiceImpl CustomerService=new CustomerServiceImpl();
		CustomerService.updateCustomer(cus);
	
		response.sendRedirect("AddCustomer.jsp");
		
	}

}

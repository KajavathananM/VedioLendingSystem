package com.oop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oop.model.*;
import com.oop.service.CustomerServiceImpl;


/**
 * Servlet implementation class AddCustomer
 */
@WebServlet("/AddCustomer")
public class AddCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	response.setContentType("text/html");
		
		Customer cus =  new Customer();
		
		cus.setName(request.getParameter("Name"));
		cus.setNIC(request.getParameter("NIC"));
		cus.setEmail(request.getParameter("Email"));
		cus.setTelephone(request.getParameter("telephone"));
		
		

		CustomerServiceImpl CustomerService = new CustomerServiceImpl();
		CustomerService.addCustomer(cus);
		
		response.sendRedirect("CustomerDetails.jsp");
		//path set to AddCustomer page
		
	}

}

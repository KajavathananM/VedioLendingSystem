package com.oop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Rent;
import com.oop.service.RentServiceImpl;


@WebServlet("/CheckRentServlet")
public class CheckRentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CheckRentServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		Rent rent = new Rent();
		rent.setRentCustomerId(request.getParameter("RentCustomerID"));
		
		RentServiceImpl irentService = new RentServiceImpl();	
		List<Rent> rents = irentService.CheckCustomerRent(rent);
		
		request.setAttribute("rents", rents);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//
	}
	
	
}

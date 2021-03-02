package com.oop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Rent;
import com.oop.service.RentServiceImpl;


@WebServlet("/UpdateRentServlet")
public class UpdateRentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateRentServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	
	response.setContentType("text/html");
	
	Rent rent = new Rent();

	rent.setRentCustomerId(request.getParameter("RentCustomerId"));
	rent.setRentDvdCode(request.getParameter("RentDvdCode"));
	rent.setRentDate(request.getParameter("RentDate"));
	
	RentServiceImpl irentService = new RentServiceImpl();	
	irentService.UpdateCustomerRent(rent);
	
	response.sendRedirect("CheckRent.jsp");
}

}
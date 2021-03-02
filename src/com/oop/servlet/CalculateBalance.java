package com.oop.servlet;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.*;
import com.oop.service.ReturnServiceImpl;

@WebServlet("/CalculateBalance")

public class CalculateBalance extends HttpServlet{
	private static final long serialVersionUID = 1L;

public CalculateBalance() {
	super();






}


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
}


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
response.setContentType("text/html");
	
	Return ret =  new Return();
	
	ret.setCustomer_NIC(request.getParameter("customer_NIC"));
	ret.setReturn_Id(request.getParameter("return_id"));
	ret.setDvd_code(request.getParameter("dvd_code"));
	ret.setReturn_Date(request.getParameter("return_date"));
	

	ReturnServiceImpl iretService = new ReturnServiceImpl();
	iretService.returnVideo(ret);

	
	
	}

}

package com.oop.servlet;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.*;
import com.oop.service.ReturnServiceImpl;

@WebServlet("/ReturnVideo")

public class ReturnVideo extends HttpServlet{
	private static final long serialVersionUID = 1L;

public ReturnVideo() {
	super();

}


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
}


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
response.setContentType("text/html");
	

	Return ret =  new Return();
	
	ret.setCustomer_NIC(request.getParameter("NICNo"));
	ret.setReturn_Id(request.getParameter("Return_Id"));
	ret.setDvd_code(request.getParameter("code"));
	ret.setReturn_Date(request.getParameter("returnDate"));

	ReturnServiceImpl iretService = new ReturnServiceImpl();
	iretService.returnVideo(ret);
	
}
}
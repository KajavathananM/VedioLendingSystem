package com.oop.servlet;



import com.oop.service.ReturnServiceImpl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Return;
import com.oop.service.IReturnService;


public class ListReturn extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListReturn() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response, Object listrent)
			throws ServletException, IOException {

		response.setContentType("text/html");
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListEmployees.jsp");
		dispatcher.forward(request, response);
	
		response.setContentType("text/html");
		
		Return ret =  new Return();
		
		ret.setCustomer_NIC(request.getParameter("customer_NIC"));
		
			try {
			
			//String NIC = request.getParameter("NICNo");
			//String delete =request.getParameter("Delete");
			//String search=request.getParameter("Search");
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vls","root","root");
			
			if("ListRent".equals(listrent)) {
			Statement st= conn.createStatement();
			String sql=("SELECT * FROM return_");
			
							 
				
							 
			st.executeUpdate(sql);
			response.sendRedirect("home2.jsp");
		
			}
			
			
			}
			catch (Exception e) {
			
			
			System.out.println("Exception is:"+e);
		}
			


			ReturnServiceImpl iretService = new ReturnServiceImpl();
			iretService.deleteReturn(ret);


			
	}


}
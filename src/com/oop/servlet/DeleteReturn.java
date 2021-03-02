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
import com.oop.service.ReturnServiceImpl;

import com.oop.model.*;
import com.oop.service.ReturnServiceImpl;

@WebServlet("/DeleteReturn")

public class DeleteReturn extends HttpServlet{
	private static final long serialVersionUID = 1L;

public DeleteReturn() {
	super();
}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	response.setContentType("text/html");
		
		Return ret =  new Return();
		
		ret.setCustomer_NIC(request.getParameter("customer_NIC"));
		
			try {
			
			String NIC = request.getParameter("NICNo");
			String delete =request.getParameter("Delete");
			//String search=request.getParameter("Search");
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/video_lend","root","root");
			
			if("Delete".equals(delete)) {
			Statement st= conn.createStatement();
			String sql=("DELETE FROM return_WHERE ReturnCustomerId=?,ReturnId=?");
			
							 
				
							 
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

		
		
		
		

		
		
		
		
		
		
		
		
		


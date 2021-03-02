package com.oop.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.oop.model.Customer;

public interface CustomerService {
	
	public void addCustomer(Customer cus);

	public void updateCustomer(Customer cus);
	
	public void DeleteCustomer(Customer cus);

}

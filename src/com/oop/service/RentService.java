package com.oop.service;


import java.util.List;

import com.oop.model.Rent;

public interface RentService {
	
	public void AddCustomerRent(Rent rent);
	
	public void UpdateCustomerRent(Rent rent);
	
	public void DeleteCustomerRent(Rent rent);
	
	public List<Rent> CheckCustomerRent(Rent rent);



}
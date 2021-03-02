package com.oop.service;

import com.oop.model.Return;


public interface IReturnService {



	
	public void returnVideo( Return ret);
	
	public void deleteReturn(Return ret);
	
	public void calculateBalance(Return ret);
	
	public void listReturn(Return ret);

}

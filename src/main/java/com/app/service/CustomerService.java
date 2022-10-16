package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CustomerDao;
import com.app.pojo.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDao customerdao;
	
	public int createCustomer(Customer customer) {
		
		return this.customerdao.saveCustomer(customer);
		
	}
	
	
	
	
	
	

}

package com.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.app.pojo.Customer;


public class CustomerDao implements ICustomerDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int saveCustomer(Customer customer) {
		
			int id = (Integer)hibernateTemplate.save(customer);
			return id;
		
	}

}

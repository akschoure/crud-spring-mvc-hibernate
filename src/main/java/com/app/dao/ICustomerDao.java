package com.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.app.pojo.Customer;

public interface ICustomerDao {
	
	
	public int saveCustomer(Customer customer);
	

}

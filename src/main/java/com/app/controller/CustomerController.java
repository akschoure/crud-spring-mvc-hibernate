package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.pojo.Customer;
import com.app.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerservice;

	@RequestMapping("/customer")
	public String showForm(Model model) {

		model.addAttribute("forms", "abc");
		return "/form";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("customer") Customer customer, Model model) {
		
		int createCustomer = this.customerservice.createCustomer(customer);
		model.addAttribute("msg","cust created with id"+createCustomer);
		
		return "/custlist";
	}

}

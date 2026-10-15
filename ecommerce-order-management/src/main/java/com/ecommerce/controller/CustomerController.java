package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.request.CustomerRequest;
import com.ecommerce.response.CustomerResponse;
import com.ecommerce.service.CustomerService;

@RestController
public class CustomerController
{

	@Autowired
	CustomerService customerService;

	@PostMapping("/creatingcustomer")
	public CustomerResponse createCustomer(@RequestBody CustomerRequest customerRequest)
	{
		CustomerResponse customer = customerService.createCustomer(customerRequest);
		return customer;
	}

	@GetMapping("/findById")
	public CustomerResponse findById(@RequestParam int id)
	{
		CustomerResponse byId = customerService.findById(id);
		return byId;
	}

	@GetMapping("/findAll")
	public List<CustomerResponse> findAll()
	{
		List<CustomerResponse> all = customerService.findAll();
		return all;
	}

}

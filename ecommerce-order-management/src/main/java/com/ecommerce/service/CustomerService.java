package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.CustomerEntity;
import com.ecommerce.repository.CustomerRepository;
import com.ecommerce.request.CustomerRequest;
import com.ecommerce.response.CustomerResponse;

@Service
public class CustomerService
{
	@Autowired
	CustomerRepository customerRepository;

	public CustomerResponse createCustomer(CustomerRequest customerRequest)
	{

		CustomerEntity CustomerEntity = new CustomerEntity();

		CustomerEntity.setName(customerRequest.getName());
		CustomerEntity.setEmail(customerRequest.getEmail());
		CustomerEntity save = customerRepository.save(CustomerEntity);

		CustomerResponse customerResponse = new CustomerResponse();

		customerResponse.setId(save.getId());
		customerResponse.setName(save.getName());
		customerResponse.setEmailId(save.getEmail());

		return customerResponse;

	}

	public CustomerResponse findById(int id)
	{
		Optional<CustomerEntity> byId = customerRepository.findById(id);
		CustomerEntity customerEntity = byId.get();

		CustomerResponse customerResponse = new CustomerResponse();
		customerResponse.setId(customerEntity.getId());
		customerResponse.setName(customerEntity.getName());
		customerResponse.setEmailId(customerEntity.getEmail());

		return customerResponse;

	}

	public List<CustomerResponse> findAll()
	{
		Iterable<CustomerEntity> all = customerRepository.findAll();
		List<CustomerResponse> listCustomerResponse = new ArrayList<>();

		for (CustomerEntity customerEntity : all)
		{
			CustomerResponse customerResponse = new CustomerResponse();
			customerResponse.setId(customerEntity.getId());
			customerResponse.setName(customerEntity.getName());
			customerResponse.setEmailId(customerEntity.getEmail());

			listCustomerResponse.add(customerResponse);

		}
		return listCustomerResponse;
	}

}

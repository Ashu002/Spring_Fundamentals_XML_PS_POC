package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

/**
 * Created by ashutosh on 23/7/17.
 */
public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;

	CustomerServiceImpl(){

	}
	//Constructor Based Injection
	CustomerServiceImpl(CustomerRepository customerRepository){
		this.customerRepository = customerRepository;
	}
	//Setter based Injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}


	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}

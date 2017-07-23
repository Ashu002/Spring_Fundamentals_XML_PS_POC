package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

/**
 * Created by ashutosh on 23/7/17.
 */
public class HibernateCustomerRepositoryImp implements CustomerRepository {

	private String dbUsername;

	@Override
	public List<Customer> findAll(){
		System.out.println(this.getDbUsername());
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Raj");
		customer.setLastName("Ojha");
		customers.add(customer);
		return customers;
	}

	public String getDbUsername() {
		return dbUsername;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}
}

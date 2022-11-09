package com.techyoda.banking.restapi.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techyoda.banking.restapi.entities.Customer;
import com.techyoda.banking.restapi.repositories.CustomerRepository;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepositoy;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		return customerRepositoy.findAll();
	}
	
	@GetMapping("/customers/{id}")
	public Customer getCustomerByID(@PathVariable(value="id") int id) {
		return customerRepositoy.findById(id).get();
	}
	
	@PostMapping("/customers")
	@Transactional
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerRepositoy.save(customer);
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerRepositoy.save(customer);
	}
	
	@DeleteMapping("/customers/{id}")
	public void deleteCustomer(@PathVariable(value="id") int id) {
		customerRepositoy.deleteById(id);
	}
}

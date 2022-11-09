package com.techyoda.banking.restapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techyoda.banking.restapi.entities.CustomerType;
import com.techyoda.banking.restapi.repositories.CustomerTypeRepository;

@RestController
public class CustomerTypeController {

	@Autowired
	CustomerTypeRepository customerTypeRepository;
	
	@GetMapping("/customer-types")
	public List<CustomerType> getAllCustomerTypes(){
		return customerTypeRepository.findAll();
	}
	
	@GetMapping("/customer-types/{id}")
	public CustomerType getCustomerTypeById(@PathVariable(name = "id")String id) {
		return customerTypeRepository.findById(id).get();
	}
	
	@PostMapping("customer-types")
	public CustomerType createCustomerType(@RequestBody CustomerType customerType) {
		return customerTypeRepository.save(customerType);
	}
	
	@PutMapping("customer-types")
	public CustomerType updateCustomerType(@RequestBody CustomerType customerType) {
		return customerTypeRepository.save(customerType);
	}
	
	@DeleteMapping("/customer-types/{id}")
	public void deleteCustomerType(@PathVariable(name = "id") String id) {
		customerTypeRepository.deleteById(id);
	}
}

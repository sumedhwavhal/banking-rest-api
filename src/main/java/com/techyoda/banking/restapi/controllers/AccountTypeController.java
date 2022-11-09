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

import com.techyoda.banking.restapi.entities.AccountType;
import com.techyoda.banking.restapi.repositories.AccountTypeRepository;

@RestController
public class AccountTypeController {
	
	@Autowired
	AccountTypeRepository accountTypeRepository;
	
	@GetMapping("/account-types")
	public List<AccountType> getAllAccountTypes(){
		return accountTypeRepository.findAll();
	}
	
	@GetMapping("/account-types/{id}")
	public AccountType getAccountTypeById(@PathVariable(name="id") int id) {
		return accountTypeRepository.findById(id).get();
	}
	
	@PostMapping("/account-types")
	public AccountType createAccountType(@RequestBody AccountType accountType) {
		return accountTypeRepository.save(accountType);
	}
	
	@PutMapping("/account-types")
	public AccountType updateAccountType(@RequestBody AccountType accountType) {
		return accountTypeRepository.save(accountType);
	}
	
	@DeleteMapping("/account-types/{id}")
	public void deleteAccountType(@PathVariable(name = "id") int id) {
		accountTypeRepository.deleteById(id);
	}
}

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

import com.techyoda.banking.restapi.entities.Account;
import com.techyoda.banking.restapi.repositories.AccountRepository;

@RestController
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@GetMapping("/accounts")
	public List<Account> getAllAccounts(){
		return accountRepository.findAll();
	}
	
	@GetMapping("accounts/{id}")
	public Account getAccountById(@PathVariable(value="id") int id) {
		return accountRepository.findById(id).get();
	}
	
	@PostMapping("/accounts")
	@Transactional
	public Account createAccount(@RequestBody Account account) {
		return accountRepository.save(account);
	}
	
	@PutMapping("/accounts")
	public Account updateAccount(@RequestBody Account account) {
		return accountRepository.save(account);
	}
	
	@DeleteMapping("/accounts/{id}")
	public void deleteAccount(@PathVariable(value = "id") int id) {
		accountRepository.deleteById(id);
	}
}

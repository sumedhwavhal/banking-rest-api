package com.techyoda.banking.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techyoda.banking.restapi.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}

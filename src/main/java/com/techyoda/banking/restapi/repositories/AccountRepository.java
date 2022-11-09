package com.techyoda.banking.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techyoda.banking.restapi.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}

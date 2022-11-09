package com.techyoda.banking.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techyoda.banking.restapi.entities.AccountType;

public interface AccountTypeRepository extends JpaRepository<AccountType, Integer> {

}

package com.techyoda.banking.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techyoda.banking.restapi.entities.CustomerType;

public interface CustomerTypeRepository extends JpaRepository<CustomerType, String> {

}

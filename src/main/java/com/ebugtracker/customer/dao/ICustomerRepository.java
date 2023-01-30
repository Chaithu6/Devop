package com.ebugtracker.customer.dao;


import com.ebugtracker.customer.entity.Customer;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Long> {

	Optional<Customer> findByCustomerId(Long customerId);
}

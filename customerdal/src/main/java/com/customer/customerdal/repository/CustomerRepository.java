package com.customer.customerdal.repository;

import com.customer.customerdal.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}

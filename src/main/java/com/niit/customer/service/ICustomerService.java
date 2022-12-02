package com.niit.customer.service;

import com.niit.customer.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    Customer save(Customer customer);
    List<Customer> getAll();
    Optional<Customer> getByID(int id);
}

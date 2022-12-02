package com.niit.customer.service;

import com.niit.customer.domain.Customer;

import java.util.List;

public interface ICustomerService {
    Customer save(Customer customer);
    List<Customer> getAll();
    Customer getByID(int id);
}

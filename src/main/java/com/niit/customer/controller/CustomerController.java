package com.niit.customer.controller;

import com.niit.customer.domain.Customer;
import com.niit.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("/customers")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(customerService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/customer/{id}")
    public ResponseEntity<?> getById(@PathVariable int id){
        return new ResponseEntity<>(customerService.getByID(id), HttpStatus.OK);
    }
    @PostMapping("/post")
    public ResponseEntity<?> save(@RequestBody Customer customer){
        return new ResponseEntity<>(customerService.save(customer), HttpStatus.CREATED);
    }
}

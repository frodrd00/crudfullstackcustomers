package com.diaspour.crud_fullstack_angular.controller;

import com.diaspour.crud_fullstack_angular.entity.Customer;
import com.diaspour.crud_fullstack_angular.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/save")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

}

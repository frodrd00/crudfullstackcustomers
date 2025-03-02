package com.diaspour.crud_fullstack_angular.controller;

import com.diaspour.crud_fullstack_angular.entity.Customer;
import com.diaspour.crud_fullstack_angular.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/customers")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping("/customers")
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @GetMapping("/customers/{id}")
    public Customer findById(@PathVariable int id) {
        return customerService.findById(id);
    }

    @DeleteMapping("/customers/{id}")
    public void delete(@PathVariable int id) {
        customerService.deleteById(id);
    }

    @PutMapping("/customers")
    public Customer update(@RequestBody Customer customer) {
        return customerService.update(customer);
    }


}

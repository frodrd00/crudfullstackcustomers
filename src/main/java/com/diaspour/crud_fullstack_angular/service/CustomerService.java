package com.diaspour.crud_fullstack_angular.service;

import com.diaspour.crud_fullstack_angular.entity.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);
    List<Customer> findAll();
    Customer findById(int id);
    void deleteById(int id);
    Customer update(Customer customer);
}

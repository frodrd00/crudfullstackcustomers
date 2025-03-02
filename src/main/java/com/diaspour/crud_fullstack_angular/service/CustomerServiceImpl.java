package com.diaspour.crud_fullstack_angular.service;

import com.diaspour.crud_fullstack_angular.entity.Customer;
import com.diaspour.crud_fullstack_angular.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return List.of();
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }
}

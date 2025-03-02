package com.diaspour.crud_fullstack_angular.service;

import com.diaspour.crud_fullstack_angular.entity.Customer;
import com.diaspour.crud_fullstack_angular.exception.ResourceNotFoundException;
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
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        Customer customer = customerRepository.findById(id);
        if(customer == null) {
            throw new ResourceNotFoundException("Customer with id " + id + " not found");
        }
        return customer;
    }

    @Override
    public void deleteById(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }
}

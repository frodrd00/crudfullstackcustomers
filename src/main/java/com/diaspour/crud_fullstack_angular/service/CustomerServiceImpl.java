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
    public Customer update(int id, Customer customer) {
        Customer customerDetails = this.findById(id);
        if(customer == null) {
            throw new ResourceNotFoundException("Customer with id " + id + " not found");
        }
        // Actualizar solo los campos que se necesiten
        if (customerDetails.getFirst_name() != null) customer.setFirst_name(customerDetails.getFirst_name());
        if (customerDetails.getEmail() != null) customer.setEmail(customerDetails.getEmail());
        if (customerDetails.getLast_name() != null) customer.setLast_name(customerDetails.getLast_name());
        return customerRepository.save(customer);
    }
}

package com.diaspour.crud_fullstack_angular.repository;

import com.diaspour.crud_fullstack_angular.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findById(int id);
}

package com.insurance.customer_service.service;

import com.insurance.customer_service.entity.Customer;
import com.insurance.customer_service.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer createCustomer(Customer customer) {
        return repository.save(customer);
    }

    public Customer getCustomer(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }
}
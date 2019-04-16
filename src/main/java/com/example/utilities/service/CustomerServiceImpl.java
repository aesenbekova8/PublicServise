package com.example.utilities.service;

import com.example.utilities.model.Customer;
import com.example.utilities.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return this.getAllCustomers();
    }

    @Override
    public Customer getCustomersById(Long id) {
        return this.getCustomersById(id);
    }

    @Override
    public Customer save(Customer c) {
        return customerRepository.save(c);
    }

    @Override
    public BigDecimal getSumPayments(Long id) {
        return customerRepository.getSumPayments(id);
    }

    @Override
    public Customer changeActiveStatus(Customer c) {
        if (c.isActive()){
            c.setActive(false);
            customerRepository.save(c);
        }
        return c;
    }
}

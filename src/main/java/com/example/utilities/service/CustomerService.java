package com.example.utilities.service;

import com.example.utilities.model.Customer;

import java.math.BigDecimal;
import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomersById(Long id);
    Customer save(Customer c);
    Customer changeActiveStatus(Customer c);

    BigDecimal getSumPayments(Long id);
}

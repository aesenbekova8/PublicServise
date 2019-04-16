package com.example.utilities.controller;

import com.example.utilities.model.Customer;
import com.example.utilities.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Customer save(@RequestBody Customer c){
        return this.customerService.save(c);
    }

    @GetMapping("/{id}")
    Customer getAllCustomersById(@PathVariable Long id){
        return this.getAllCustomersById(id);
    }

    @GetMapping
    List<Customer> getAllCustomers(){
        return this.getAllCustomers();
    }

    @GetMapping("/{id}/sum")
    private BigDecimal getSum(@PathVariable Long id){
        return customerService.getSumPayments(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    private Customer changeCustomer(@RequestBody Customer c){
        return customerService.changeActiveStatus(c);
    }
}

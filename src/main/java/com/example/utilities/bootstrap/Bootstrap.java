package com.example.utilities.bootstrap;

import com.example.utilities.model.Customer;
import com.example.utilities.model.Payment;
import com.example.utilities.service.CustomerService;
import com.example.utilities.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Bootstrap implements CommandLineRunner {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private PaymentService paymentService;

    @Override
    public void run(String... args) throws Exception {
        Customer c1 = new Customer();
        c1.setFullName("Customer1");
        c1.setActive(false);
        c1.setPhoneNo("0109");
        customerService.save(c1);

        Payment p1 = new Payment(BigDecimal.TEN, c1);
        paymentService.save(p1);

    }
}

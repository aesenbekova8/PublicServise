package com.example.utilities.service;

import com.example.utilities.model.Customer;
import com.example.utilities.model.Payment;

import java.sql.Timestamp;
import java.util.List;

public interface PaymentService {
    Payment save(Payment p);
    List<Payment> getAllPayments();
    Payment getPaymentById(Long id);
}

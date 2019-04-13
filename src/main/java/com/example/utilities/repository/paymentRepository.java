package com.example.utilities.repository;

import com.example.utilities.model.Customer;
import com.example.utilities.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface paymentRepository extends JpaRepository<Customer, Payment> {
}

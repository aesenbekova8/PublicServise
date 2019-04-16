package com.example.utilities.repository;

import com.example.utilities.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
//    @Query(value = "select sum(p.amount) from Payment p join p.customer c where c.id = :customer_id")
//    BigDecimal getSumPayments(@Param("customer_id") Long id);
}

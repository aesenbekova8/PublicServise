package com.example.utilities.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    private LocalDateTime time;

    private String status;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    public Payment() {
    }

    public Payment(Long id, BigDecimal amount, LocalDateTime time, String status, Customer customer) {
        this.id = id;
        this.amount = amount;
        this.time = LocalDateTime.now();
        this.status = status;
        this.customer = customer;
    }

    public Payment(BigDecimal amount, Customer customer) {
        this.amount = amount;
        this.time = LocalDateTime.now();
        this.customer = customer;
        if (amount.remainder(BigDecimal.valueOf(2)).equals(BigDecimal.ZERO)){
            this.status = "OK";
        }
        else {
            this.status = "ERROR";
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmout() {
        return amount;
    }

    public void setAmout(BigDecimal amout) {
        this.amount = amout;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

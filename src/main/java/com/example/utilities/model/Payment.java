package com.example.utilities.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long customerId;

    double sum;

    Timestamp time;

    boolean status;

    public Payment() {
    }

    public Payment(Long id, Long customerId, double sum, Timestamp time, boolean status) {
        this.id = id;
        this.customerId = customerId;
        this.sum = sum;
        this.time = time;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

package com.example.utilities.controller;

import com.example.utilities.model.Payment;
import com.example.utilities.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

   @PostMapping
   @ResponseStatus(HttpStatus.CREATED)
    Payment save(@RequestBody Payment p){
       return paymentService.save(p);
   }

   @GetMapping
    List<Payment> getAllPayment(){
       return paymentService.getAllPayments();
   }

   @GetMapping("/{id}")
    Payment getPaymentById(@PathVariable Long id){
       return paymentService.getPaymentById(id);
   }
}

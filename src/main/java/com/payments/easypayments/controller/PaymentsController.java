package com.payments.easypayments.controller;

import com.payments.easypayments.model.PaymentRequest;
import com.payments.easypayments.model.PaymentResponse;
import com.payments.easypayments.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value ="/payments")
public class PaymentsController {

    @Autowired
    PaymentService paymentService;

    @PostMapping(value = "/pay", consumes = "application/json")
    public PaymentResponse makePayment(@RequestBody PaymentRequest paymentRequest) {
        PaymentResponse response = new PaymentResponse();
        paymentService.handlePaymentRequest(paymentRequest);

        return response;
    }

    @PostMapping(value = "/request", consumes = "application/json")
    public PaymentResponse requestPayment(@RequestBody PaymentRequest paymentRequest) {
        PaymentResponse response = new PaymentResponse();


        return response;
    }
}

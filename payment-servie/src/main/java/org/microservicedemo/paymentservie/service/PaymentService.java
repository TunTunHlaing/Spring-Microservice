package org.microservicedemo.paymentservie.service;

import org.microservicedemo.paymentservie.model.PaymentRequest;
import org.microservicedemo.paymentservie.model.PaymentResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {
    public PaymentResponse makePayment(PaymentRequest request) {
        return new PaymentResponse(UUID.randomUUID().toString(), request.orderId(), request.amount());
    }
}

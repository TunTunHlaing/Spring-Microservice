package org.microservicedemo.paymentservie.api;

import org.microservicedemo.paymentservie.model.PaymentRequest;
import org.microservicedemo.paymentservie.model.PaymentResponse;
import org.microservicedemo.paymentservie.service.PaymentService;
import org.microservicedemo.paymentservie.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pay")
public class PaymentApi {

    @Autowired
    private PaymentService service;

    @PostMapping
    public ApiResponse<PaymentResponse> makePayment(@RequestBody PaymentRequest request) {
        return ApiResponse.success(service.makePayment(request));
    }

    @GetMapping
    public ApiResponse<String> pay() {
        return ApiResponse.success("PayApi");
    }
}

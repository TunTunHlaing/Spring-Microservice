package org.microservicedemo.api;

import org.microservicedemo.model.OrderRequest;
import org.microservicedemo.model.OrderResponse;
import org.microservicedemo.service.OrderService;
import org.microservicedemo.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderApi {

    @Autowired
    private OrderService service;

    @PostMapping
    public ApiResponse<OrderResponse> makeOrder (OrderRequest request) {
         return ApiResponse.success(service.makeOrder(request));
    }
}

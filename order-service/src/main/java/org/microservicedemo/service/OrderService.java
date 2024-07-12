package org.microservicedemo.service;

import org.microservicedemo.model.OrderRequest;
import org.microservicedemo.model.OrderResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    public OrderResponse makeOrder (OrderRequest request) {
        return new OrderResponse(UUID.randomUUID().toString());
    }
}

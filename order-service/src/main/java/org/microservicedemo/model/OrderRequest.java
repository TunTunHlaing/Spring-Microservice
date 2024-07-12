package org.microservicedemo.model;

import java.math.BigDecimal;

public record OrderRequest(
        String orderName,
        Integer quantity,
        BigDecimal totalAmount
) {
}

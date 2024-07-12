package org.microservicedemo.paymentservie.model;

import java.math.BigDecimal;

public record PaymentRequest(
        String orderId,
        BigDecimal amount
) {
}

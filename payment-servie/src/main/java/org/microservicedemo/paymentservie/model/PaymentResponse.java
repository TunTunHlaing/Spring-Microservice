package org.microservicedemo.paymentservie.model;

import java.math.BigDecimal;

public record PaymentResponse(
        String paymentId,
        String orderId,
        BigDecimal amount
) {
}

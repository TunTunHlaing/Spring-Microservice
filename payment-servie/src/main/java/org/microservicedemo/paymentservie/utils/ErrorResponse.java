package org.microservicedemo.paymentservie.utils;

import java.util.List;

public record ErrorResponse(
        Type type,
        List<String> messages
) {

    public ErrorResponse(Type type, String message) {
        this(type, List.of(message));
    }

    public enum Type{
        SYSTEM, BUSINESS , PLATFORM
    }

}

package org.microservicedemo.paymentservie.utils;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
public record ApiResponse<T>(
        ResponseCode code,
        T payload,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        LocalDateTime issueAt
) {

    public static<T> ApiResponse<T> success(T payload) {
        return new ApiResponse<>(ResponseCode.CODE_000, payload, LocalDateTime.now());
    }

    public static ApiResponse<ErrorResponse> error(ErrorResponse payload) {
        return new ApiResponse<>(ResponseCode.CODE_001, payload, LocalDateTime.now());
    }


}

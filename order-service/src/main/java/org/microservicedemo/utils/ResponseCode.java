package org.microservicedemo.utils;

import lombok.Getter;

@Getter
public  enum ResponseCode {
    CODE_000("Success"), CODE_001("Error");

    private String description;

    private ResponseCode(String description) {
        this.description = description;
    }
}
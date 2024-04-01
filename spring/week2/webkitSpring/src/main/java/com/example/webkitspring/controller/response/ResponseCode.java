package com.example.webkitspring.controller.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseCode {
    OK(200000),
    Created(201000);
    int code;
}

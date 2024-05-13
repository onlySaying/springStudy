package com.example.webkitspring.error.response;

import com.example.webkitspring.error.code.ErrorCode;
import jakarta.validation.constraints.NegativeOrZero;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Data
public class ApiErrorResponse {
    private int code;
    private String message;

    public static ApiErrorResponse of(ErrorCode errorCode, String message){
        return ApiErrorResponse.builder()
                .code(errorCode.getCode())
                .message(message)
                .build();
    }

}

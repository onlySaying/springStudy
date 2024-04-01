package com.example.webkitspring.controller.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ApiResponse<E> {
    private ResponseCode code;
    private E data;

    public static <E> ApiResponse<E> response(ResponseCode code, E data){
        return ApiResponse.<E>builder()
                .code(code)
                .data(data)
                .build();
    }
}

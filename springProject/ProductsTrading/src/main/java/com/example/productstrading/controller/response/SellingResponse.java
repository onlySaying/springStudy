package com.example.productstrading.controller.response;

import com.example.productstrading.domain.model.Buying;
import com.example.productstrading.domain.model.Selling;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

public class SellingResponse {

    @Data
    @Builder
    public static class Detail
    {
        private Long id;
        private LocalDate date;
        private int price;
        private String p_name;

        public static Detail of(Selling selling)
        {
            return Detail.builder()
                    .id(selling.getId())
                    .date(selling.getDate())
                    .price(selling.getPrice())
                    .p_name(selling.getP_name())
                    .build();
        }
    }
}

package com.example.productstrading.controller.response;

import com.example.productstrading.domain.model.Buying;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

public class BuyingResponse {

    @Data
    @Builder
    public static class Detail
    {
        private Long id;
        private LocalDate date;
        private int price;
        private String p_name;

        public static Detail of(Buying buying)
        {
            return Detail.builder()
                    .id(buying.getId())
                    .date(buying.getDate())
                    .price(buying.getPrice())
                    .p_name(buying.getP_name())
                    .build();
        }
    }
}

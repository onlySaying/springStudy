package com.example.productstrading.controller.response;

import com.example.productstrading.domain.model.Dealing;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

public class DealingResponse {

    @Data
    @Builder
    public static class Detail
    {
        private Long id;
        private LocalDate date;
        private int price;
        private String p_name;
        private String sellerId;
        private String buyerId;
        private String trackingNumber;
        private boolean tComplete;

        public static Detail of(Dealing dealing)
        {
            return Detail.builder()
                    .id(dealing.getId())
                    .date(dealing.getDate())
                    .price(dealing.getPrice())
                    .p_name(dealing.getP_name())
                    .sellerId(dealing.getSellerId())
                    .buyerId(dealing.getBuyerId())
                    .trackingNumber(dealing.getTrackingNumber())
                    .tComplete(dealing.isTComplete())
                    .build();
        }
    }
}

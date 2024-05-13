package com.example.productstrading.controller.request;

import lombok.Data;

import java.time.LocalDate;

public class DealingRequest {
    @Data
    public static class create{
        private LocalDate date;
        private int price;
        private String p_name;
        private String sellerId;
        private String buyerId;
        private String trackingNumber;
        private boolean tComplete;
    }

    @Data
    public static class update
    {
        private String trackingNumber;
        private String buyerId;
        private boolean tComplete;
    }
}

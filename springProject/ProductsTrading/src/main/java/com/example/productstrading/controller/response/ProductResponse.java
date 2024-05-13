package com.example.productstrading.controller.response;

import com.example.productstrading.domain.model.Product;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;


public class ProductResponse {

    @Data
    @Builder
    public static class Detail
    {
        private Long id;
        private LocalDate date;
        private int price;
        private String p_name;
        private String user;
        private String p_contents;
        public static Detail of(Product product)
        {
            return Detail.builder()
                    .id(product.getId())
                    .date(product.getDate())
                    .price(product.getPrice())
                    .p_name(product.getP_name())
                    .user(product.getUserID())
                    .p_contents(product.getP_contents())
                    .build();
        }
    }

    @Data
    @Builder
    public static class ListElem
    {
        private Long id;
        private LocalDate date;
        private int price;
        private String p_name;
        private String user;

        public static ListElem of(Product product)
        {
            return ListElem.builder()
                    .id(product.getId())
                    .date(product.getDate())
                    .price(product.getPrice())
                    .p_name(product.getP_name())
                    .user(product.getUserID())
                    .build();
        }
    }

}

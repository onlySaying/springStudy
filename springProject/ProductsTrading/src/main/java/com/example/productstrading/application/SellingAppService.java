package com.example.productstrading.application;

import com.example.productstrading.controller.request.BuyingRequest;
import com.example.productstrading.controller.request.SellingRequest;
import com.example.productstrading.controller.response.BuyingResponse;
import com.example.productstrading.controller.response.SellingResponse;
import com.example.productstrading.domain.model.Buying;
import com.example.productstrading.domain.model.Selling;
import com.example.productstrading.domain.responsity.BuyingRepository;
import com.example.productstrading.domain.responsity.SellingRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SellingAppService {
    private final SellingRepository sellingRepository;

    @Transactional
    public List<SellingResponse.Detail> retireveList()
    {
        return sellingRepository.findAll().stream().map(SellingResponse.Detail::of).toList();
    }

    @Transactional
    public SellingResponse.Detail createSell(SellingRequest.create request)
    {

        Selling selling = Selling.builder()
                .date(LocalDate.now())
                .price(request.getPrice())
                .p_name(request.getP_name())
                .build();

        sellingRepository.save(selling);
        return SellingResponse.Detail.of(selling);
    }
}

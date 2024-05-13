package com.example.productstrading.application;

import com.example.productstrading.controller.request.DealingRequest;
import com.example.productstrading.controller.response.BuyingResponse;
import com.example.productstrading.controller.response.DealingResponse;
import com.example.productstrading.controller.response.ProductResponse;
import com.example.productstrading.domain.model.Dealing;
import com.example.productstrading.domain.responsity.DealingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
@RequiredArgsConstructor
public class DealingAppService {

    private final DealingRepository dealingRepository;

    public Dealing findDealing(long id)
    {
        return dealingRepository.findById(id).orElseThrow();
    }
    public DealingResponse.Detail retrieveDeal(Long id)
    {
        Dealing dealing = findDealing(id);
        return DealingResponse.Detail.of(dealing);
    }

    public DealingResponse.Detail createDealing(DealingRequest.create request)
    {
        Dealing dealing = Dealing.builder()
                .date(LocalDate.now())
                .price(request.getPrice())
                .p_name(request.getP_name())
                .sellerId(request.getSellerId())
                .buyerId(request.getBuyerId())
                .trackingNumber(request.getTrackingNumber())
                .tComplete(false)
                .build();

        dealingRepository.save(dealing);

        return DealingResponse.Detail.of(dealing);
    }

    public List<DealingResponse.Detail> retrieveList()
    {
        return dealingRepository.findAll().stream().map(DealingResponse.Detail::of).toList();
    }
}

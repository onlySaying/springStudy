package com.example.productstrading.application;

import com.example.productstrading.controller.request.BuyingRequest;
import com.example.productstrading.controller.response.BuyingResponse;
import com.example.productstrading.domain.model.Buying;
import com.example.productstrading.domain.responsity.BuyingRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BuyingAppService {
    private final BuyingRepository buyingRepository;

    @Transactional
    public List<BuyingResponse.Detail> retrieveList()
    {
        return buyingRepository.findAll().stream().map(BuyingResponse.Detail::of).toList();
    }

    @Transactional
    public List<BuyingResponse.Detail> retrieveList(Long id)
    {
        return buyingRepository.findById(id).stream().map(BuyingResponse.Detail::of).toList();
    }

    @Transactional
    public BuyingResponse.Detail createBuy(BuyingRequest.create request)
    {

        Buying buying = Buying.builder()
                .date(LocalDate.now())
                .price(request.getPrice())
                .p_name(request.getP_name())
                .build();

        buyingRepository.save(buying);

        return BuyingResponse.Detail.of(buying);
    }
}

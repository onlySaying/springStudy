package com.example.productstrading.controller;

import com.example.productstrading.application.*;
import com.example.productstrading.controller.request.*;
import com.example.productstrading.controller.response.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PTradingController
{
    private final BuyingAppService buyingAppService;
    private final SellingAppService sellingAppService;
    private final ProductAppService productAppService;
    private final DealingAppService dealingAppService;
    private final UserAppService userAppService;



    @GetMapping("/buying")
    public List<BuyingResponse.Detail> retrieveAllBuying()
    {
        return buyingAppService.retrieveList();
    }

    @PostMapping("/buying")
    public BuyingResponse.Detail createBuying(@RequestBody BuyingRequest.create request)
    {
        return buyingAppService.createBuy(request);
    }



    @GetMapping("/selling")
    public List<SellingResponse.Detail> retrieveAllSelling()
    {
        return sellingAppService.retireveList();
    }

    @PostMapping("/selling")
    public SellingResponse.Detail createSelling(@RequestBody SellingRequest.create request)
    {
        return sellingAppService.createSell(request);
    }

    @GetMapping("/product")
    public List<ProductResponse.ListElem> retrieveAllProduct() {return productAppService.retrieveList();}

    @GetMapping("/product/{id}")
    public ProductResponse.Detail retrieveProductDetail(@PathVariable Long id)
    {
        return productAppService.retrieveDetail(id);
    }

    @PostMapping("/product")
    public ProductResponse.Detail createProduct(@RequestBody ProductRequest.create request)
    {
        return productAppService.createProduct(request);
    }

    @GetMapping("/dealing/{id}")
    public DealingResponse.Detail retrieveDealingDetail(@PathVariable Long id)
    {
        return dealingAppService.retrieveDeal(id);
    }

    @GetMapping("/dealing")
    public List<DealingResponse.Detail> retrieveAllDealing()
    {
        return dealingAppService.retrieveList();
    }
    @PostMapping("/dealing")
    public DealingResponse.Detail createDealing(@RequestBody DealingRequest.create request)
    {
        return dealingAppService.createDealing(request);
    }

    @PostMapping("/signup")
    public UserResponse.Detail createUser(@RequestBody UserRequest.create request)
    {
        return userAppService.createUser(request);
    }

    @PostMapping("/signup/{id}")
    public UserResponse.Detail updateUser(@PathVariable Long id, @RequestBody UserRequest.update request)
    {
        return userAppService.updateUser(id, request);
    }

    @PostMapping("/login")
    public Long login(@RequestBody UserRequest.login request)
    {
        return userAppService.login(request);
    }


    @DeleteMapping("/resign/{id}")
    public String QuitPath(@PathVariable Long id)
    {
        userAppService.deleteUser(id);
        return "done";
    }


}

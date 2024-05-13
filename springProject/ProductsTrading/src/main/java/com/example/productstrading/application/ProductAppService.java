package com.example.productstrading.application;

import com.example.productstrading.controller.request.ProductRequest;
import com.example.productstrading.controller.response.ProductResponse;
import com.example.productstrading.domain.model.Product;
import com.example.productstrading.domain.responsity.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductAppService {
    private final ProductRepository productRepository;

    @Transactional
    public List<ProductResponse.ListElem> retrieveList()
    {
        return productRepository.findAll().stream().map(ProductResponse.ListElem::of).toList();
    }

    @Transactional
    public ProductResponse.Detail createProduct(ProductRequest.create request)
    {
        Product product = Product.builder()
                .date(LocalDate.now())
                .price(request.getPrice())
                .p_name(request.getP_name())
                .userID(request.getUser())
                .p_contents(request.getP_contents())
                .build();

        productRepository.save(product);

        return ProductResponse.Detail.of(product);
    }

    public Product findProduct(Long id)
    {
        return productRepository.findById(id).orElseThrow();
    }

    public ProductResponse.Detail retrieveDetail(Long id) {
        Product product = findProduct(id);
        return ProductResponse.Detail.of(product);
    }

}

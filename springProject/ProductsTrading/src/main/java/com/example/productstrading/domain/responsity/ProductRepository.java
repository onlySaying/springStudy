package com.example.productstrading.domain.responsity;

import com.example.productstrading.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

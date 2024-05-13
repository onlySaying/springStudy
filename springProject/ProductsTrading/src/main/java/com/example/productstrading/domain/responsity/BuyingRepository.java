package com.example.productstrading.domain.responsity;

import com.example.productstrading.domain.model.Buying;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyingRepository extends JpaRepository <Buying, Long> {
}

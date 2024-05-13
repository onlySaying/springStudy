package com.example.productstrading.domain.responsity;

import com.example.productstrading.domain.model.Dealing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealingRepository extends JpaRepository<Dealing, Long> {
}

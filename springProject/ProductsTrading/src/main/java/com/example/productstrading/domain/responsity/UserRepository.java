package com.example.productstrading.domain.responsity;

import com.example.productstrading.domain.model.UserContext;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserContext, Long> {
    UserContext findByUserId(String userId);
}

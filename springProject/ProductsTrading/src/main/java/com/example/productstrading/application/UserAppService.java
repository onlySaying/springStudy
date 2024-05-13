package com.example.productstrading.application;

import com.example.productstrading.controller.request.UserRequest;
import com.example.productstrading.controller.response.UserResponse;
import com.example.productstrading.domain.model.UserContext;
import com.example.productstrading.domain.responsity.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserAppService {
    private final UserRepository userRepository;

    @Transactional
    public UserResponse.Detail createUser(UserRequest.create request)
    {
        UserContext user = UserContext.builder()
                .userId(request.getUserId())
                .password(request.getPassword())
                .name(request.getName())
                .address(request.getAddress())
                .build();

        userRepository.save(user);

        return UserResponse.Detail.of(user);
    }

    public UserContext findUser(Long id)
    {
        UserContext user = userRepository.findById(id).orElseThrow();
        return user;
    }

    @Transactional
    public Long login(UserRequest.login request)
    {
        UserContext user = userRepository.findByUserId(request.getUserId());
        if(user.getPassword().equals(request.getPassword())) return user.getId();
        return 0L;
    }

    @Transactional
    public UserResponse.Detail updateUser(Long id, UserRequest.update requset)
    {
        UserContext user = findUser(id);

        user.setPassword(requset.getPassword());
        user.setName(requset.getName());
        user.setAddress(requset.getAddress());

        userRepository.save(user);

        return UserResponse.Detail.of(user);
    }

    @Transactional
    public void deleteUser(Long id)
    {
        UserContext user = findUser(id);
        userRepository.delete(user);
    }
}

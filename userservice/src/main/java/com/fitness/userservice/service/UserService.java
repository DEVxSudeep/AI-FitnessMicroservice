package com.fitness.userservice.service;

import com.fitness.userservice.dto.UserRegisterRequest;
import com.fitness.userservice.dto.UserResponse;
import com.fitness.userservice.model.User;
import com.fitness.userservice.model.UserRole;
import com.fitness.userservice.repo.UserRepo;
import com.fitness.userservice.util.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;
    //private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    public UserResponse getUserprofile(String userId) {

        User user = userRepo.findById(userId)
                .orElseThrow(() ->
                        new RuntimeException("User not found with id: " + userId));

        return UserMapper.toResponse(user);
    }


    public UserResponse register(UserRegisterRequest request) {

        if (userRepo.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Email already registered");
        }

        User saved = userRepo.save(UserMapper.toRegister(request));

        return UserMapper.toResponse(saved);
    }

    public Boolean validateUser(String userId) {
        return userRepo.existsById(userId);
    }
}

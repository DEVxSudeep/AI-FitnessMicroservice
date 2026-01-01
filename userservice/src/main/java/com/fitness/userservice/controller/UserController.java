package com.fitness.userservice.controller;

import com.fitness.userservice.dto.UserRegisterRequest;
import com.fitness.userservice.dto.UserResponse;
import com.fitness.userservice.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @GetMapping("/{userId}")
    public ResponseEntity<UserResponse> getUserProile(@PathVariable String userId){
        return ResponseEntity.ok(userService.getUserprofile(userId)) ;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> registerUser( @Valid  @RequestBody UserRegisterRequest requestBody){
        return ResponseEntity.ok(userService.register(requestBody)) ;
    }

    @GetMapping("/{userId}/validate")
    public ResponseEntity<Boolean> validateUserById(@PathVariable String userId){
        return ResponseEntity.ok(userService.validateUser(userId)) ;
    }

}

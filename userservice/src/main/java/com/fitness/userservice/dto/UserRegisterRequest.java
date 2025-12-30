package com.fitness.userservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRegisterRequest {
    @NotBlank(message = "Email should not be empty")
    @Email(message = "Please Provide a valid Email")
    private String email;
    @NotBlank(message = "Please Provide the password")
    @Size(min = 6,message = "Provide password having minimum 6 letters")
    private String password;
    private String firstName;
    private String lastName;
}

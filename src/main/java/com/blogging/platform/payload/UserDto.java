package com.blogging.platform.payload;

import jakarta.validation.constraints.*;

public class UserDto {

    private Long id;

    @NotBlank(message = "Username is required")
    private String username;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;
    
}

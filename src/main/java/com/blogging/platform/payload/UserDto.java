package com.blogging.platform.payload;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class UserDto {

    // will be used for login??? pr something i don't know?
    private Long id;

    @NotBlank(message = "Username is required")
    private String username;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;
    
}

package com.blogging.platform.payload;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class RegisterReq {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Surname is required")
    private String surname;

    @NotBlank(message = "Username is required")
    private String username;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Password is required")
    private String email;

    @NotBlank
    @Size(min = 8, message = "Password should be a  minimum of 8 characters")
    private String password;
}

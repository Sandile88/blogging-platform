package com.blogging.platform.payload;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;

public class NewUserDto {
    //added all of the variables here incase of new user creation


    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;


    @NotBlank(message = "Username is required")
    private String username;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;

    @NotEmpty
    @Size(min = 8, message = "Password should be a minimum of 8 characters")
    @Column(nullable = false)
    private String password;
    
}

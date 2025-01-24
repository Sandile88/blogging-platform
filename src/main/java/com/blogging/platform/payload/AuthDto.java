package com.blogging.platform.payload;

import java.time.LocalDateTime;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class AuthDto {
    @NotNull(message = "User ID is required")
    private Long userId;

    @NotBlank(message = "Token cannot be empty")
    private String token;
    private String refreshToken;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

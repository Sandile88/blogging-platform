package com.blogging.platform.payload;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class BlogDto {

    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    @Size(min = 300, message = "Content must be at least 300 characters")
    private String content;

    @NotNull(message = "User ID is required")
    private Long userId;
    private String username; 
    private List<String> tags;
    private Long likes;
    private Long views;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}

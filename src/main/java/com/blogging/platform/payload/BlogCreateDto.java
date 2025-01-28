package com.blogging.platform.payload;

import java.util.List;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class BlogCreateDto {

    @NotBlank(message = "Title is required")
    private String title;

    @Size(min = 300, message = "Content must be at least 300 characters")
    private String content;

    private List<String> tags;
    
}

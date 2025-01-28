package com.blogging.platform.payload;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.validation.constraints.Size;

public class BlogResDto {

    private Long id;
    private String title;
    private String content;
    private Long userId;
    private String username; 
    private List<String> tags;
    private Long likes;
    private Long views;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
}

package com.blogging.platform.payload;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CommentDto {
    private Long id;

    @NotNull(message = "User ID is required")
    private Long userId;

    @NotNull(message = "Blog ID is required")

    private Long blogId;
    private Long parentId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

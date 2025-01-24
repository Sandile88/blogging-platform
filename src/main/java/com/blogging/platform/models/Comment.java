package com.blogging.platform.models;



import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long blogId;
    private Long parentId; //for nested comments
    private LocalDateTime createdAt;
    private LocalDateTime updateddAt;

}
package com.blogging.platform.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "blogs")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "blog", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments;  // List of comments on this blog post. Will be deleted if blog is deleted

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user; //user who wrote blog post

    @ElementCollection
    private List<String> tags;
    
    private String title;
    private String content;
    private Long likes;
    private Long views;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    

}
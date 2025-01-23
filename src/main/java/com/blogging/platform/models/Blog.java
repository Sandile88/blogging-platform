package com.blogging.platform.models;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "blog_posts")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private Long userId;
    private String tags;
    private String likes;
    private String views;
    private DateTimeFormat createdAt;


    

}
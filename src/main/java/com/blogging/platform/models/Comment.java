package com.blogging.platform.models;


import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long blogId;
    private DateTimeFormat createdAt;
    private DateTimeFormat updateddAt;


    

}
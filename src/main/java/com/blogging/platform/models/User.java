package com.blogging.platform.models;

import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @NotEmpty
    @Column(nullable = false, unique = true)
    private String username;

    @NotEmpty
    @Column(nullable = false, unique = true)
    private String email;

    @NotEmpty
    @Size(min = 8, message = "Password should be a minimum of 8 characters")
    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Comment> blogs;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Comment> comments;

}
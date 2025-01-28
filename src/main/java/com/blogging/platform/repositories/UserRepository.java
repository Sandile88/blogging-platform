package com.blogging.platform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogging.platform.models.User;
// import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {

    // these already exists , add these if it doesn't exist
    // List<User> findByEmail(String email);
    // List<User> findByUsername(String username);
    // Boolean existsByEmail(String email);
    // Boolean existsByUsername(String userName);

    
}
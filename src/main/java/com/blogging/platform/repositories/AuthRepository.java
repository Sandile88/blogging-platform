package com.blogging.platform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogging.platform.models.Auth;

public interface AuthRepository extends JpaRepository<Auth, Long>  {
}
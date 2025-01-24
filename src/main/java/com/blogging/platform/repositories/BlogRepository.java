package com.blogging.platform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogging.platform.models.Blog;

public interface BlogRepository extends JpaRepository<Blog, Long>{
}
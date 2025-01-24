package com.blogging.platform.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogging.platform.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{
    List<Comment> findByBlogId(Long blogId);
}
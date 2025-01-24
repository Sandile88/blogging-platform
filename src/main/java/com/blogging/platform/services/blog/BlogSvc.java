package com.blogging.platform.services.blog;

import java.util.List;

import com.blogging.platform.payload.BlogDto;

public interface BlogSvc {

    BlogDto createBlog(BlogDto blogDto);
    BlogDto getBlog(Long blogId);
    List<BlogDto> getAllBlogs(int pageNum, int PageSize);
    BlogDto updateBlog(Long id, BlogDto blogDto);
    BlogDto deleteBlog(Long blogId);
    BlogDto likeBlog(Long blogId, Long userId); 
}
package com.blogging.platform.services.blog;

import java.util.List;

import com.blogging.platform.payload.BlogCreateDto;
import com.blogging.platform.payload.BlogResDto;

public interface BlogSvc {

    BlogCreateDto createBlog(BlogCreateDto blogDto);
    BlogResDto getBlog(Long blogId);
    List<BlogResDto> getAllBlogs(int pageNum, int PageSize);
    BlogResDto updateBlog(Long id, BlogResDto blogDto);
    BlogResDto deleteBlog(Long blogId);
    BlogResDto likeBlog(Long blogId, Long userId); 
}
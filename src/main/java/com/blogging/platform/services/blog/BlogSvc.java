package com.blogging.platform.services.blog;

import java.util.List;

import com.blogging.platform.payload.BlogCreateDto;
import com.blogging.platform.payload.BlogResDto;

public interface BlogSvc {

    BlogResDto createBlog(BlogCreateDto blogDto);
    BlogResDto getBlog(Long blogId);
    List<BlogResDto> getAllBlogs(int pageNum, int pageSize);
    BlogResDto updateBlog(Long id, BlogCreateDto blogDto);
    void deleteBlog(Long blogId);
    BlogResDto toggleBlogLike(Long blogId, Long userId); 
}
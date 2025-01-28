package com.blogging.platform.services.comment;

import java.util.List;

import com.blogging.platform.payload.CommentDto;

public interface CommentSvc {

    CommentDto createComment(CommentDto commentDto);
    List<CommentDto> getCommentsByBlog(Long blogId);
    List<CommentDto> getRepliesByComment(Long commendId);
    CommentDto updateComment(Long commentId, CommentDto commentDto);
    void deleteComment(Long commendId); 
}
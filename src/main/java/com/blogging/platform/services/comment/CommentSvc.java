package com.blogging.platform.services.comment;

import com.blogging.platform.payload.CommentDto;

public interface CommentSvc {

    CommentDto createComment(CommentDto commentDto);
    CommentDto getCommentsByBlog(Long blogId);
    CommentDto updateComment(Long commentId, CommentDto commentDto);
    CommentDto deleteComment(Long commendId); 
}
package com.blogging.platform.services.user;

import java.util.List;

import com.blogging.platform.payload.BlogResDto;
import com.blogging.platform.payload.CommentDto;
import com.blogging.platform.payload.UserDto;

public interface UserSvc {

    UserDto getUser(Long id);
    UserDto updateUser(Long id, UserDto userDto);
    List<BlogResDto> getUserBlogs(Long userId, int pageNum, int pageSize);
    List<CommentDto> getUserComments(Long userId, int pageNum, int pageSize);
}

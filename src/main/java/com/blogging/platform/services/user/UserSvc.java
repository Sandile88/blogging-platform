package com.blogging.platform.services.user;

import com.blogging.platform.payload.UserDto;

public interface UserSvc {

    UserDto getUser(Long id);
    UserDto updateUser(Long id, UserDto userDto);
}
package com.blogging.platform.payload;

import lombok.Data;

@Data
public class LoginReq {
    private String usernameOrEmail;
    private String password;
}

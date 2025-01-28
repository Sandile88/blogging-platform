package com.blogging.platform.payload;

import lombok.Data;

@Data
public class RegisterReq {

    private String name;
    private String surname;
    private String username;
    private String email;
    private String password;
}

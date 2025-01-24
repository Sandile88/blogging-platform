package com.blogging.platform.services.auth;

import com.blogging.platform.payload.LoginReq;
import com.blogging.platform.payload.RegisterReq;

public interface AuthSvc {
    String registerUser(LoginReq loginReq );
    String registerUser(RegisterReq RegisterReq );
    String refreshToken(String refreshToken);
    String logoutUser(String token);

}
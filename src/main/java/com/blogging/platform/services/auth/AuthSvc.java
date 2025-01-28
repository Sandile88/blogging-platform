package com.blogging.platform.services.auth;

import com.blogging.platform.payload.AuthDto;
import com.blogging.platform.payload.LoginReq;
import com.blogging.platform.payload.RegisterReq;

public interface AuthSvc {
    AuthDto loginUser(LoginReq loginReq );
    AuthDto registerUser(RegisterReq RegisterReq );
    AuthDto refreshToken(String refreshToken);
    void logoutUser(String token);

}
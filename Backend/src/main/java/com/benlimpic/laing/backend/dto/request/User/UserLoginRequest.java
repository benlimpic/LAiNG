package com.benlimpic.laing.backend.dto.request.User;

import lombok.*;

@Data
public class UserLoginRequest {

    private String email;
    private String password;

}

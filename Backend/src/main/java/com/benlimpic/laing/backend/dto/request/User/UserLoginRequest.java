package com.benlimpic.laing.backend.dto.request;

import lombok.*;

@Data
public class UserLoginRequest {
    private String username;
    private String password;
    private String email;

}

package com.benlimpic.laing.backend.dto.request.User;

import lombok.*;

@Data
public class UserSignupRequest {

    private String email;
    private String password;
}

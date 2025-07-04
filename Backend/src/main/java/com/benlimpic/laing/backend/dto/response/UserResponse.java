package com.benlimpic.laing.backend.dto.response;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private String username;
    private String email;
    private String firstName;
    private String lastName;
}



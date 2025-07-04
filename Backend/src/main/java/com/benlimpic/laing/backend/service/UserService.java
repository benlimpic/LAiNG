package com.benlimpic.laing.backend.service;

import org.springframework.stereotype.Service;
import com.benlimpic.laing.backend.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
}

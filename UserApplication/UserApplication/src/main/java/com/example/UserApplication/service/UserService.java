package com.example.UserApplication.service;

import com.example.UserApplication.model.User; // Correct import
import com.example.UserApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        // In production, consider hashing the password before saving
        return userRepository.save(user);
    }
}

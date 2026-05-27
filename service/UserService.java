package com.example.jwtauth.service;

import com.example.jwtauth.model.UserEntity;
import com.example.jwtauth.repo.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder encoder;

    public UserService(UserRepository userRepository, PasswordEncoder encoder) {
        this.userRepository = userRepository;
        this.encoder = encoder;
    }

    public UserEntity register(String username, String rawPassword) {
        UserEntity user = new UserEntity(username, encoder.encode(rawPassword), "ROLE_USER");
        return userRepository.save(user);
    }

    public Optional<UserEntity> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}

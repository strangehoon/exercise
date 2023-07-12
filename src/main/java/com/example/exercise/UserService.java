package com.example.exercise;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UserService {

    private final UserRepository userRepository;


    @Transactional
    public void saveUser(User user){
        userRepository.save(user);
    }
}

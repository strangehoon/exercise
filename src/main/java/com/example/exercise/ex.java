package com.example.exercise;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ex {

    private final UserRepository userRepository;

    @RequestMapping("/ex")
    public String ex(){
        User user = new User();
        user.setContent("hello");
        userRepository.save(user);
        return "hellos!!";
    }


}

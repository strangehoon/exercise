package com.example.exercise;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ex {

    private final UserService userService;

    @PostMapping ("/ex1")
    public String ex(){
        User user = new User();
        user.setContent("hello");
        userService.saveUser(user);
        return "hellos!!";
    }

    @RequestMapping("/ex2")
    public String ex2(){
        return "hellos!!";
    }

}

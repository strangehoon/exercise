package com.example.exercise;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ex {

    private final UserService userService;

    @GetMapping("/ex1")
    public String ex(){
        log.info("1");
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

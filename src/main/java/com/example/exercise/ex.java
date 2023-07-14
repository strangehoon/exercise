package com.example.exercise;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ex {

    private final UserService userService;

    @PostMapping("/ex1")
    public void ex(@RequestParam String content){
        log.info("11!1");
        User user = new User();
        user.setContent(content);
        userService.saveUser(user);
        //return "hellos!!";
    }

    @RequestMapping("/ex2")
    public String ex2(){
        return "hellos!!!!!!!!!!!!!!!!!!!!!!!!!!";
    }

}

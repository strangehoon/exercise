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
        User user = new User();
        user.setContent(content);
        userService.saveUser(user);
        //return "hellos!!";
    }

    @RequestMapping("/ex2")
    public String ex2(){
        return "hellos my name is banana";
    }

//    @GetMapping("/ex3")
//    public void slackErrorSampleController() {
//        log.info("this log is info");
//        log.warn("this log is warn");
//        log.error("this log is error");
//    }
//
//    @GetMapping("/ex4/{id}")
//    public String ex4(@PathVariable Long id) {
//        return userService.findUser(id);
//    }
}

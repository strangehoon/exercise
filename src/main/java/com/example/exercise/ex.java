package com.example.exercise;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ex {

    @RequestMapping("/ex")
    public String ex(){
        return "hellos";
    }


}

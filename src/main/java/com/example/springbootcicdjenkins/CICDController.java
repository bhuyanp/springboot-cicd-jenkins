package com.example.springbootcicdjenkins;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {

    @GetMapping
    public String home(){
        return "Hello World";
    }

}

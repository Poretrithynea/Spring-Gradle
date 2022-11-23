package com.example.springwithgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SPringwithGradleApplication {


    @GetMapping
    public static void main(String[] args) {
        SpringApplication.run(SPringwithGradleApplication.class, args);

    }

}

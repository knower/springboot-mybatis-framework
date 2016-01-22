package com.monkeycoding.xyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
@SpringBootApplication
@RestController
public class App {

    @RequestMapping("/")
    public String test() {
        return "Hello,SpringBoot";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

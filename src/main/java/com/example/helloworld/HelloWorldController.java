package com.example.helloworld;

import com.example.helloworld.service.UserService;
import com.example.helloworld.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/world")
public class HelloWorldController {

    @Autowired
    UserService service;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/user")
    public User getUser() {

        User user = service.readUser();
        return user;

    }
}

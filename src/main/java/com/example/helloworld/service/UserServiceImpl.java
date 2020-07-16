package com.example.helloworld.service;

import com.example.helloworld.vo.User;
import org.springframework.stereotype.Component;


@Component
public class UserServiceImpl extends UserServiceBaseImpl {

    public User readUser() {

        User user = new User();
        user.setFirstName("Ganesh");
        user.setLastName("Jayaraman");
        user.setFullName(user.getFirstName() + " " + user.getLastName());
        user.setEmail("ganesh@example.com");
        return user;

    }
}

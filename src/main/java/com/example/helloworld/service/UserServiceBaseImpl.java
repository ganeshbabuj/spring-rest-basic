package com.example.helloworld.service;

import com.example.helloworld.vo.User;


public class UserServiceBaseImpl  implements UserService{

    public User readUser() {

        User user = new User();
        user.setFirstName("Ganesh");
        user.setLastName("Jayaraman");
        user.setEmail("ganesh@example.com");
        return user;

    }
}

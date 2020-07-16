package com.example.helloworld.vo;


import lombok.Data;

@Data
public class User {

    private Integer id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;

}

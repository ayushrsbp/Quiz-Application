package com.quiz.forms;

import com.quiz.entities.Role;

import lombok.Data;

@Data
public class UserForm {
    private String username;
    private String password;
    private String name;
    private String profilePicUrl;
    private Role role;
    private String email;
    private String phoneNumber;
    private String about;
}

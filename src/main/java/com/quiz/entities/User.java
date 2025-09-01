package com.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private String username;
    private String password;
    private String name;
    private String profilePicUrl;
    private Role role;
    private String email;
    private String phoneNumber;
    private String about;
    @mapping
    List<Team> teams;
}

package com.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
@Entity
@Component
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
    @OneToMany(mappedBy = "admin")
    private List<Team> teams = new ArrayList<>();
    @OneToMany(mappedBy = "student")
    private List<Response> responses = new ArrayList<>();
}

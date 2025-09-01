package com.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.ManyToMany;

@Data
@Entity
public class Team {
    @Id
    private String teamId;
    private String teamName;
    @ManyToOne
    private User admin;
    @ManyToMany
    private List<User> members = new ArrayList<>();
    @OneToMany(mappedBy="team")
    private List<Quiz> quizzes = new ArrayList<>();

}

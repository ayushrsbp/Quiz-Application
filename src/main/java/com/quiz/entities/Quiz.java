package com.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
@Entity
public class Quiz {

    @Id
    private String quizId;
    private String title;
    private String description;
    @ManyToOne
    private Team team;
    @OneToMany(mappedBy = "quiz")
    private List<Question> questions = new ArrayList<>();
    @OneToMany(mappedBy = "quiz")
    private List<Response> responses = new ArrayList<>();
}

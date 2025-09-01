package com.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Question {

    @Id
    private String questionId;
    private String content;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctOption;
    @ManyToOne
    private Quiz quiz;
}

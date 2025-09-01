package com.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Response {
    @Id
    private String responseId;
    private String answer;
    @ManyToOne
    private User student;
    @ManyToOne
    private Quiz quiz;
    @OneToOne
    private Question question;
}

package com.test.exam.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Answer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private long id_answer;

    @ManyToOne
    @JoinColumn(name = "id_question")
    private Question idQuestion;
    @Column(name = "val_answer")
    private String valAnswer;
    private int response;

    public long getId_answer() {
        return id_answer;
    }

    public void setId_answer(long id_answer) {
        this.id_answer = id_answer;
    }

    public Question getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Question idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getValAnswer() {
        return valAnswer;
    }

    public void setValAnswer(String valAnswer) {
        this.valAnswer = valAnswer;
    }

    public int getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }
}

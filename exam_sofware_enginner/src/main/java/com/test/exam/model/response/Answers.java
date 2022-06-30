package com.test.exam.model.response;

import java.io.Serializable;

public class Answers implements Serializable {
    private static final long serialVersionUID = 1L;
    private String numAnswer;
    private String descAnswer;
    private Long idAnswer;

    public String getNumAnswer() {
        return numAnswer;
    }

    public void setNumAnswer(String numAnswer) {
        this.numAnswer = numAnswer;
    }

    public String getDescAnswer() {
        return descAnswer;
    }

    public void setDescAnswer(String descAnswer) {
        this.descAnswer = descAnswer;
    }

    public Long getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(Long idAnswer) {
        this.idAnswer = idAnswer;
    }
}

package com.test.exam.model.response;


import java.io.Serializable;

public class ResponseScore implements Serializable {
    private static final long serialVersionUID = 1L;
    private String score;
    private boolean isAprovate;

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public boolean isAprovate() {
        return isAprovate;
    }

    public void setAprovate(boolean aprovate) {
        isAprovate = aprovate;
    }
}

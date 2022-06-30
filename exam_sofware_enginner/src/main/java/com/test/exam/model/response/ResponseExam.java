package com.test.exam.model.response;


import java.io.Serializable;
import java.util.List;

public class ResponseExam implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long idQuestion;
    private String question;
    private List<Answers> answer;
    private double valor;

    public Long getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Long idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answers> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answers> answer) {
        this.answer = answer;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

package com.test.exam.model.resquest;

import com.test.exam.model.response.Answers;

import java.io.Serializable;

public class AnswerSelect implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long idQuestion;
    private Answers answer;
    private double valor;

    public Long getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Long idQuestion) {
        this.idQuestion = idQuestion;
    }

    public Answers getAnswer() {
        return answer;
    }

    public void setAnswer(Answers answer) {
        this.answer = answer;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

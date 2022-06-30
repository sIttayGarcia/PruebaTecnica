package com.test.exam.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "question")
public class Question implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private long id_question;
    @ManyToOne
    @JoinColumn(name = "id_exam")
    private Exam exam;
    private String val_question;

    public long getId_question() {
        return id_question;
    }

    public void setId_question(long id_question) {
        this.id_question = id_question;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public String getVal_question() {
        return val_question;
    }

    public void setVal_question(String val_question) {
        this.val_question = val_question;
    }
}

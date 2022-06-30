package com.test.exam.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "assign")
public class Assign implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_assign")
    private Long idAssing;
    @ManyToOne
    @JoinColumn(name = "id_students")
    private Students students;
    @Column(name = "date_aplication")
    private String dateAplication;
    private int active;
    private double score;

    public Long getIdAssing() {
        return idAssing;
    }

    public void setIdAssing(Long idAssing) {
        this.idAssing = idAssing;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public String getDateAplication() {
        return dateAplication;
    }

    public void setDateAplication(String dateAplication) {
        this.dateAplication = dateAplication;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

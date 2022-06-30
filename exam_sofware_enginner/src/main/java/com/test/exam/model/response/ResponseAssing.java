package com.test.exam.model.response;


import java.io.Serializable;

public class ResponseAssing implements Serializable {
    private static final long serialVersionUID = 1L;
    private StudentResponse students;
    private boolean active;
    private String dateTimeZoneStudent;
    private String dateTimeBogotaZone;
    private String score;

    public StudentResponse getStudents() {
        return students;
    }

    public void setStudents(StudentResponse students) {
        this.students = students;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getDateTimeZoneStudent() {
        return dateTimeZoneStudent;
    }

    public void setDateTimeZoneStudent(String dateTimeZoneStudent) {
        this.dateTimeZoneStudent = dateTimeZoneStudent;
    }

    public String getDateTimeBogotaZone() {
        return dateTimeBogotaZone;
    }

    public void setDateTimeBogotaZone(String dateTimeBogotaZone) {
        this.dateTimeBogotaZone = dateTimeBogotaZone;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}

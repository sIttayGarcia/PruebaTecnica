package com.test.exam.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "students")
public class Students implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_students")
    public long idStudents;
    @Column(name = "name")
    public String name;
    @Column(name = "age")
    public int age;
    @Column(name = "city")
    public String city;
    @ManyToOne
    @JoinColumn(name = "id_time_zone")
    private TimeZones idTimeZone;

    public long getIdStudents() {
        return idStudents;
    }

    public void setIdStudents(long idStudents) {
        this.idStudents = idStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public TimeZones getIdTimeZone() {
        return idTimeZone;
    }

    public void setIdTimeZone(TimeZones idTimeZone) {
        this.idTimeZone = idTimeZone;
    }
}

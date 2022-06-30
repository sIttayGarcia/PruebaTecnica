package com.test.exam.model.response;


public class StudentResponse {
    public long idStudents;
    public String name;
    public int age;
    public String city;

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
}

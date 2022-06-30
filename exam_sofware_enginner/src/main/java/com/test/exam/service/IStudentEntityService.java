package com.test.exam.service;

import com.test.exam.model.response.ResponseAssing;

import java.text.ParseException;

public interface IStudentEntityService {
    public ResponseAssing getStudent(Long id) throws ParseException;
}

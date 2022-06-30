package com.test.exam.controller;

import com.test.exam.model.resquest.RequestAnswer;
import com.test.exam.service.IExamEntityService;
import com.test.exam.service.IStudentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
public class ExamController {
    @Autowired
    IStudentEntityService studentService;
    @Autowired
    IExamEntityService examService;

    @GetMapping(value = "/student/{id}", produces = "application/json")
    public Object getStuden(@PathVariable("id") long id) throws ParseException {
        return studentService.getStudent(id);
    }

    @GetMapping(value = "/exam/student/{idStudent}", produces = "application/json")
    public Object getExamStuden(@PathVariable("idStudent") long idStudent) {
        return examService.getExam(idStudent);
    }

    @PostMapping(value = "/exam/student/{idStudent}", produces = "application/json")
    public Object getResultExam(@PathVariable("idStudent") long idStudent, @RequestBody RequestAnswer answer) {
        return examService.getScore(idStudent, answer.getAnswers());
    }
}

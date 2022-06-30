package com.test.exam.service;

import com.test.exam.entity.*;
import com.test.exam.model.Assign;
import com.test.exam.model.Exam;
import com.test.exam.model.Students;
import com.test.exam.model.response.Answers;
import com.test.exam.model.response.ResponseExam;
import com.test.exam.model.response.ResponseScore;
import com.test.exam.model.resquest.AnswerSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class ExamEntityServiceImp implements IExamEntityService {
    @Autowired
    ExamEntity examEntity;
    @Autowired
    StudentEntity studentEntity;
    @Autowired
    QuestionsEntity questions;
    @Autowired
    AnswerEntity answerEntity;
    @Autowired
    AssignEntity assignment;

    @Override
    public List<ResponseExam> getExam(Long idStudent) {
        Students student = studentEntity.findById(idStudent).get();
        Exam exam = examEntity.findByTimeZone(student.getIdTimeZone());
        List<ResponseExam> listEx = new ArrayList<>();
        questions.findByExam(exam).forEach(question -> {
            ResponseExam resp = new ResponseExam();
            resp.setQuestion(question.getVal_question());
            resp.setIdQuestion(question.getId_question());
            List<Answers> list = new ArrayList();
            AtomicInteger count = new AtomicInteger(1);
            answerEntity.findByIdQuestion(question).forEach(answer -> {
                Answers answers = new Answers();
                answers.setDescAnswer(answer.getValAnswer());
                answers.setIdAnswer(answer.getId_answer());
                answers.setNumAnswer(String.valueOf(count.getAndIncrement()));
                list.add(answers);
            });
            resp.setAnswer(list);
            listEx.add(resp);
        });
        listEx.forEach(responseExam -> {
            responseExam.setValor((double) Math.round((100 / listEx.size()) * 100d) / 100d);
        });
        return listEx;
    }

    @Override
    public ResponseScore getScore(Long idStudent, List<AnswerSelect> answer) {
        ResponseScore score = new ResponseScore();
        AtomicReference<Double> total = new AtomicReference<>(00.0);
        Students student = studentEntity.findById(idStudent).get();
        Exam exam = examEntity.findByTimeZone(student.getIdTimeZone());

        answer.forEach(answerSelect -> {
            questions.findByExam(exam).forEach(question -> {
                if (question.getId_question() == answerSelect.getIdQuestion())
                    answerEntity.findByIdQuestion(question).forEach(answers -> {
                        if ((answers.getId_answer() == answerSelect.getAnswer().getIdAnswer()) && answers.getResponse() == 1) {
                            total.updateAndGet(v -> new Double((double) (v + answerSelect.getValor())));
                        }
                    });
            });
        });
        Assign ass = assignment.findByStudents(student);
        ass.setScore(total.get());
        ass.setActive(0);
        assignment.saveAndFlush(ass);
        score.setScore(String.valueOf(total));
        score.setAprovate(total.get() >= 70);
        return score;
    }
}

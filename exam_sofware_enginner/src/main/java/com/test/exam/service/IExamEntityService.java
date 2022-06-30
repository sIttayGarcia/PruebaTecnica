package com.test.exam.service;

import com.test.exam.model.response.ResponseExam;
import com.test.exam.model.response.ResponseScore;
import com.test.exam.model.resquest.AnswerSelect;

import java.util.List;

public interface IExamEntityService {
    public List<ResponseExam> getExam(Long idStudent);
    public ResponseScore getScore(Long idStudent,List<AnswerSelect> answer);
}

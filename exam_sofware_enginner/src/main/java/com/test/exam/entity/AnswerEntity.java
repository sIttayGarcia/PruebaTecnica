package com.test.exam.entity;

import com.test.exam.model.Answer;
import com.test.exam.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerEntity extends JpaRepository<Answer, Long> {
   List<Answer> findByIdQuestion(Question question);
}

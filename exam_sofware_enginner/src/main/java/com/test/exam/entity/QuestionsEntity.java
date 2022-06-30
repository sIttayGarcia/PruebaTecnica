package com.test.exam.entity;

import com.test.exam.model.Exam;
import com.test.exam.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionsEntity extends JpaRepository<Question,Long> {
    List<Question> findByExam(Exam exam);
}

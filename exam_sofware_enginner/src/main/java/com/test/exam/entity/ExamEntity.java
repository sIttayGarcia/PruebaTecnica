package com.test.exam.entity;

import com.test.exam.model.Exam;
import com.test.exam.model.TimeZones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamEntity extends JpaRepository<Exam,Long> {
    Exam findByTimeZone(TimeZones idTime);
}

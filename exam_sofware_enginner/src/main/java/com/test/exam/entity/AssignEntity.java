package com.test.exam.entity;

import com.test.exam.model.Assign;
import com.test.exam.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignEntity extends JpaRepository<Assign, Long> {
    Assign findByStudents(Students student);
}

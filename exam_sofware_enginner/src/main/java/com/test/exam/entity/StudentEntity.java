package com.test.exam.entity;

import com.test.exam.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentEntity extends JpaRepository<Students,Long> {
}

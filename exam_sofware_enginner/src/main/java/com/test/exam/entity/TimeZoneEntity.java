package com.test.exam.entity;

import com.test.exam.model.TimeZones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeZoneEntity extends JpaRepository<TimeZones,Long> {
}

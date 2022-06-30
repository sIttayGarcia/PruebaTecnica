package com.test.exam.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "exam")
public class Exam implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private long id_exam;
    @ManyToOne
    @JoinColumn(name = "id_time_zone")
    private TimeZones timeZone;

}

package com.test.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "timezone")
public class TimeZones implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_time_zone")
    private long idTimeZone;
    @Column(name = "desc_time_zone")
    private String descTimeZone;

    public long getIdTimeZone() {
        return idTimeZone;
    }

    public void setIdTimeZone(long idTimeZone) {
        this.idTimeZone = idTimeZone;
    }

    public String getDescTimeZone() {
        return descTimeZone;
    }

    public void setDescTimeZone(String descTimeZone) {
        this.descTimeZone = descTimeZone;
    }
}

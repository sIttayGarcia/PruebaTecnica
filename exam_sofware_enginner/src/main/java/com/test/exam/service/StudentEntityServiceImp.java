package com.test.exam.service;

import com.test.exam.entity.AssignEntity;
import com.test.exam.entity.StudentEntity;
import com.test.exam.entity.TimeZoneEntity;
import com.test.exam.model.Assign;
import com.test.exam.model.Students;
import com.test.exam.model.TimeZones;
import com.test.exam.model.response.ResponseAssing;
import com.test.exam.model.response.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

@Service
public class StudentEntityServiceImp implements IStudentEntityService {
    @Autowired
    StudentEntity studentEntity;
    @Autowired
    TimeZoneEntity timeZone;
    @Autowired
    AssignEntity assignment;


    @Override
    public ResponseAssing getStudent(Long id) throws ParseException {
        ResponseAssing resp = new ResponseAssing();
        Students student = studentEntity.getById(id);
        Assign assign = assignment.findByStudents(student);
        TimeZones zone = timeZone.findById(student.getIdTimeZone().getIdTimeZone()).get();
        resp.setDateTimeZoneStudent(getTodayDate(assign.getDateAplication(), zone.getDescTimeZone()));
        resp.setDateTimeBogotaZone(getTodayDate(assign.getDateAplication(), "America/Bogota"));
        StudentResponse studentResp = new StudentResponse();
        studentResp.setIdStudents(student.getIdStudents());
        studentResp.setAge(student.getAge());
        studentResp.setName(student.getName());
        studentResp.setCity(student.getCity());
        resp.setScore(assign.getActive() == 1?null:String.valueOf(assign.getScore()));
        resp.setStudents(studentResp);
        resp.setActive(assign.getActive() == 1);
        return resp;
    }

    public String getTodayDate(String date, String timeZone) throws ParseException {
        String[] dates = date.split(" ");
        String[] hours = dates[1].split(":");
        dates = dates[0].split("-");
        Calendar calendar = new GregorianCalendar();
        calendar.set(Integer.valueOf(dates[0]), Integer.valueOf(dates[1]) - 1, Integer.valueOf(dates[2]),
                Integer.valueOf(hours[0]), Integer.valueOf(hours[1]), Integer.valueOf(hours[2]));
        SimpleDateFormat sdfMadrid = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssXXX");
        sdfMadrid.setTimeZone(TimeZone.getTimeZone(timeZone));
        return sdfMadrid.format(calendar.getTime());
    }
}

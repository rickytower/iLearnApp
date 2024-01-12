package org.iLearn.iLearnApp.model.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Calendar;
import java.util.Date;

public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private ExamTypeMethod examTypeMethod;
    private Date examDate;
    private static final int daysBeforeDeadLine = 2;
    private int grade;
    private ExamStatus status;

}

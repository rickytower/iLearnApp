package org.iLearn.iLearnApp.model.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Calendar;
import java.util.Date;
@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Can be taken by the course?
     */
    private String name;
    private ExamTypeMethod examTypeMethod;
    private Date examDate;

    /**
     * It is used to calculate the day on which the enrollment for the exam will close.
     * <p>
     * IE: exam date: 10 December,  daysBeforeDeadLine: 2 -> Exam registration closing day: 8 December.
     */
    private static final int daysBeforeDeadLine = 2;
    private int grade;
    private ExamStatus status;
    public Exam(){

    }
    @JsonCreator
    public Exam(@JsonProperty("id")Long id,
                @JsonProperty("name") String name,
                @JsonProperty("examTypeMethod") ExamTypeMethod examTypeMethod,
                @JsonProperty("examDate") Date examDate
    ) {
        this.id = id;
        this.name = name;
        this.examDate = examDate;
        this.examTypeMethod = examTypeMethod;
    }

}

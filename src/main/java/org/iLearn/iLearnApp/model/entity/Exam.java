package org.iLearn.iLearnApp.model.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

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
    @ManyToOne
    private Course course;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExamTypeMethod getExamTypeMethod() {
        return examTypeMethod;
    }

    public void setExamTypeMethod(ExamTypeMethod examTypeMethod) {
        this.examTypeMethod = examTypeMethod;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public ExamStatus getStatus() {
        return status;
    }

    public void setStatus(ExamStatus status) {
        this.status = status;
    }


}

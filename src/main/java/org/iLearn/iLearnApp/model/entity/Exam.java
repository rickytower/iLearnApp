package org.iLearn.iLearnApp.model.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Calendar;
import java.util.Date;
@Entity
@NoArgsConstructor
@Setter
@Getter
public class Exam {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Can be taken by the course?
     */
    private String name;
    @Enumerated(EnumType.STRING)
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

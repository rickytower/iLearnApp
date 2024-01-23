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
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Exam {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "exam")
    Set<StudentRegistration> studentRegistrations;

    private String name;

    @Enumerated(EnumType.STRING)
    private ExamTypeMethod examTypeMethod;

    private Date examDate;

    @ManyToOne
    private Course course;

    /**
     * It is used to calculate the day on which the enrollment for the exam will close.
     *
     * IE: exam date: 10 December,  daysBeforeDeadLine: 2 -> Exam registration closing day: 8 December.
     */
    private static final int daysBeforeDeadLine = 2;

    @JsonCreator
    public Exam(@JsonProperty("id")Long id,
                @JsonProperty("name") String name,
                @JsonProperty("examTypeMethod") ExamTypeMethod examTypeMethod,
                @JsonProperty("examDate") Date examDate,
                @JsonProperty("course") String course
    ) {
        this.id = id;
        this.name = name;
        this.examDate = examDate;
        this.examTypeMethod = examTypeMethod;
    }

}

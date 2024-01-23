package org.iLearn.iLearnApp.model.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class StudentRegistration {
//    @Id
//    @Setter(AccessLevel.NONE)
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @EmbeddedId
    @EmbeddedId
    private StudentRegistrationKey id;

    @ManyToOne
    @MapsId("studentID")
    @JoinColumn(name="student_id")
    Student student;

    @ManyToOne
    @MapsId("examID")
    @JoinColumn(name="exam_id")
    Exam exam;

    private int grade;

    private Date registrationDate;

    private ExamStatus status;

    @JsonCreator
    public StudentRegistration(@JsonProperty("studentID")Long studentID,
                @JsonProperty("examID") Long examID,
                @JsonProperty("grade") int grade,
                @JsonProperty("registrationDate") Date registrationDate,
                @JsonProperty("status") ExamStatus status

    ) {
//        this.id = id;
//        this.examID = examID;
//        this.studentID = studentID;
        this.grade = grade;
        this.registrationDate = registrationDate;
        this.status = status;
    }
}



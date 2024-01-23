package org.iLearn.iLearnApp.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class StudentRegistrationKey implements Serializable {

    @Column(name = "student_id")
    Long studentID;

    @Column(name = "exam_id")
    Long examID;
}

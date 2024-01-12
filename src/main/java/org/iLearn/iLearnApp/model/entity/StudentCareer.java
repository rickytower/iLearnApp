package org.iLearn.iLearnApp.model.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

public class StudentCareer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private List<Course> teachingPlan;
    private List<Exam> recordBook;
    private List<Integer> taxes;
}

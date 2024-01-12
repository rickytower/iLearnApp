package org.iLearn.iLearnApp.model.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

public class StudentCareer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Rappresent the list of course on which a student want to enroll or is already enrolled.
     *
     * Must be changed in a single session, cannot be put in "draft" status.
     *
     * Course of which the exam result was previously accepted cannot be removed.
     */
    private List<Course> teachingPlan;
    private List<Exam> recordBook;
    private List<Integer> taxes;
}

package org.iLearn.iLearnApp.model.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * Rappresents the semester for each year, 0 for autumn, 1 for spring.
     */
    private int semester;

    /**
     * Rappresents the list of exam for each course
     */
    private List<Exam> examList;

    /**
     * Rappresents the total CFU for each course
     */
    private int cfu;


    private String courseName;
    private CourseType courseType;
}

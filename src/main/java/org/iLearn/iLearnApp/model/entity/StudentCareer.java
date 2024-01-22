package org.iLearn.iLearnApp.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@NoArgsConstructor
@Setter
@Getter
public class StudentCareer {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Rappresent the list of course on which a student want to enroll or is already enrolled.
     *
     * Must be changed in a single session, cannot be put in "draft" status.
     *
     * Course of which the exam result was previously accepted cannot be removed.
     */
    @OneToMany
    private List<Course> teachingPlan;
    @OneToMany
    private List<Exam> recordBook;

    private List<Integer> taxes;
    @OneToOne(mappedBy = "studentCareer")
    private Student student;
}

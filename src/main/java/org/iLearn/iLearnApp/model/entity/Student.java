package org.iLearn.iLearnApp.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Student extends UserRegistred {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_career_id", referencedColumnName = "id")
    private StudentCareer studentCareer;

    /**
     * Rappresent the list of course on which a student want to enroll or is already enrolled.
     *
     * Must be changed in a single session, cannot be put in "draft" status.
     *
     * Course of which the exam result was previously accepted cannot be removed.
     */
    @OneToMany
    private List<Course> teachingPlan;

    @OneToMany(mappedBy = "student")
    Set<StudentRegistration> studentRegistrations;

//
//    @OneToMany
//    private List<Integer> taxes;


    public Student(String firstname, String lastname, String telephoneNumber, String fiscalCode, String username, String password, String address, String city, RoleType roleType) {
        super(firstname, lastname, telephoneNumber, fiscalCode, username, password, address, city, roleType);
    }


}

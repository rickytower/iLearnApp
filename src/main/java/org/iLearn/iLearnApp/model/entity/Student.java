package org.iLearn.iLearnApp.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Student extends UserRegistred {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_career_id", referencedColumnName = "id")
    private StudentCareer studentCareer;
    public Student(String firstname, String lastname, String telephoneNumber, String fiscalCode, String username, String password, String address, String city, RoleType roleType) {
        super(firstname, lastname, telephoneNumber, fiscalCode, username, password, address, city, roleType);
    }


}

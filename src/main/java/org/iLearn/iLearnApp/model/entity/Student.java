package org.iLearn.iLearnApp.model.entity;

public class Student extends UserRegistred {
    private StudentCareer studentCareer;
    public Student(String id, String password){
        super(id, password);

    }
    public Student(String firstName, String lastName, String telephoneNumber, String fiscalCode, String username, String password, String address, String city, RoleType roleType) {
        super(firstName, lastName, telephoneNumber, fiscalCode, username, password, address, city, roleType);
    }
}

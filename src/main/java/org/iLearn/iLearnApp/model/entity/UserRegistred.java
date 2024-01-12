package org.iLearn.iLearnApp.model.entity;

import jakarta.persistence.*;

@Entity
public class UserRegistred{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String telephoneNumber;
    private String fiscalCode;
    @Column(unique = true)
    private String username;
    private String password;
    private String address;
    private String city;
    private String email;
    private RoleType roleType;
    public UserRegistred(String id, String password) {
    }
    public UserRegistred(String firstName, String lastName, String telephoneNumber, String fiscalCode, String username, String password, String address, String city, RoleType roleType) {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public RoleType getRoleType() {
        return roleType;
    }
}

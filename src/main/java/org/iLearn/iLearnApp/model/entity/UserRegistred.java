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

    protected Long getId() {
        return id;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    protected String getTelephoneNumber() {
        return telephoneNumber;
    }

    protected String getFiscalCode() {
        return fiscalCode;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    protected String getAddress() {
        return address;
    }

    protected String getCity() {
        return city;
    }

    protected String getEmail() {
        return email;
    }

    protected RoleType getRoleType() {
        return roleType;
    }
}

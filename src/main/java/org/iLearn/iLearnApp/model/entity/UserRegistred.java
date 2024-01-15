package org.iLearn.iLearnApp.model.entity;

import jakarta.persistence.*;

@Entity
public class UserRegistred{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
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
    public UserRegistred(String firstname, String lastname, String telephoneNumber, String fiscalCode, String username, String password, String address, String city, RoleType roleType) {
    }

    protected Long getId() {
        return id;
    }

    protected String getFirstname() {
        return firstname;
    }

    protected String getLastname() {
        return lastname;
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

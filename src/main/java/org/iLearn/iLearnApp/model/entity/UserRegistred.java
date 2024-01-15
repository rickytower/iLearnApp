package org.iLearn.iLearnApp.model.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.lang.reflect.Field;

@Entity
public class UserRegistred {

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

    // Default constructor is needed for Jackson deserialization
    public UserRegistred() {
    }

    // Constructor with arguments for Jackson deserialization
    @JsonCreator
    public UserRegistred(
            @JsonProperty("firstname") String firstname,
            @JsonProperty("lastname") String lastname,
            @JsonProperty("telephoneNumber") String telephoneNumber,
            @JsonProperty("fiscalCode") String fiscalCode,
            @JsonProperty("username") String username,
            @JsonProperty("password") String password,
            @JsonProperty("address") String address,
            @JsonProperty("city") String city,
            @JsonProperty("email") String email,
            @JsonProperty("roleType") RoleType roleType) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.telephoneNumber = telephoneNumber;
        this.fiscalCode = fiscalCode;
        this.username = username;
        this.password = password;
        this.address = address;
        this.city = city;
        this.email = email;
        this.roleType = roleType;
    }

    public UserRegistred(String id, String password) {
    }

    public UserRegistred(String firstname, String lastname, String telephoneNumber, String fiscalCode, String username, String password, String address, String city, RoleType roleType) {
    }

    // Getter & setters methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public String propertyToString() {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            Class<?> clazz = this.getClass();
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                String fieldName = field.getName();
                Object value = field.get(this);

                stringBuilder.append(fieldName)
                        .append(": ")
                        .append(value)
                        .append(System.lineSeparator());
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        }

        return stringBuilder.toString();
    }

}

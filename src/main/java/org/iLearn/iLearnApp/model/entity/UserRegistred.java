package org.iLearn.iLearnApp.model.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.Field;

@Entity
@NoArgsConstructor
@Setter
@Getter
public abstract class UserRegistred {

    @Id
    @Setter(AccessLevel.NONE)
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
    @Enumerated(EnumType.STRING)
    private RoleType roleType;


    // Constructor with arguments for Jackson deserialization
    @JsonCreator
    public UserRegistred(
            @JsonProperty("firstname") String firstName,
            @JsonProperty("lastname") String lastName,
            @JsonProperty("telephoneNumber") String telephoneNumber,
            @JsonProperty("fiscalCode") String fiscalCode,
            @JsonProperty("username") String username,
            @JsonProperty("password") String password,
            @JsonProperty("address") String address,
            @JsonProperty("city") String city,
            @JsonProperty("email") String email,
            @JsonProperty("roleType") RoleType roleType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        this.fiscalCode = fiscalCode;
        this.username = username;
        this.password = password;
        this.address = address;
        this.city = city;
        this.email = email;
        this.roleType = roleType;
    }
    public UserRegistred(String firstName, String lastName, String telephoneNumber, String fiscalCode, String username, String password, String address, String city, RoleType roleType) {
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

package org.iLearn.iLearnApp.model.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
public class Professor extends UserRegistred {
    public Professor(String firstname, String lastname, String telephoneNumber, String fiscalCode, String username, String password, String address, String city, RoleType roleType) {
        super(firstname, lastname, telephoneNumber, fiscalCode, username, password, address, city, roleType);
    }
}

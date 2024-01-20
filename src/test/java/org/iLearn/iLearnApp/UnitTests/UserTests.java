package org.iLearn.iLearnApp.UnitTests;

import org.iLearn.iLearnApp.model.entity.RoleType;
import org.iLearn.iLearnApp.model.entity.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTests {

    Student tmpStudent = new Student(
            "Nome",
            "Cognome",
            "123123123",
            "CFCFCF00C00C000C",
            "Username",
            "Password",
            "Address",
            "City",
            RoleType.STUDENT
    );



    @Test
    public void testSetGetFirstname() {
        tmpStudent.setFirstname("NewFirstName");
        assertEquals("NewFirstName", tmpStudent.getFirstname());
    }

    @Test
    public void testSetGetLastname() {
        tmpStudent.setLastname("NewLastName");
        assertEquals("NewLastName", tmpStudent.getLastname());
    }

    @Test
    public void testSetGetPhoneNumber() {
        tmpStudent.setTelephoneNumber("987654321");
        assertEquals("987654321", tmpStudent.getTelephoneNumber());
    }

    @Test
    public void testSetGetFiscalCode() {
        tmpStudent.setFiscalCode("XYZXYZ00X00X000X");
        assertEquals("XYZXYZ00X00X000X", tmpStudent.getFiscalCode());
    }

    @Test
    public void testSetGetUsername() {
        tmpStudent.setUsername("username2");
        assertEquals("username2", tmpStudent.getUsername());
    }

    @Test
    public void testSetGetPassword() {
        tmpStudent.setPassword("newPassword");
        assertEquals("newPassword", tmpStudent.getPassword());
    }

    @Test
    public void testSetGetAddress() {
        tmpStudent.setAddress("NewAddress");
        assertEquals("NewAddress", tmpStudent.getAddress());
    }

    @Test
    public void testSetGetCity() {
        tmpStudent.setCity("NewCity");
        assertEquals("NewCity", tmpStudent.getCity());
    }

    @Test
    public void testSetGetRoleType() {
        tmpStudent.setRoleType(RoleType.PROFESSOR);
        assertEquals(RoleType.PROFESSOR, tmpStudent.getRoleType());
    }



}

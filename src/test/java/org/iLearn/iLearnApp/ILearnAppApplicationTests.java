package org.iLearn.iLearnApp;

import io.restassured.RestAssured;
import org.iLearn.iLearnApp.model.entity.Exam;
import org.iLearn.iLearnApp.model.entity.RoleType;
import org.iLearn.iLearnApp.model.entity.UserRegistred;
import org.iLearn.iLearnApp.model.repository.UserRegistredRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ILearnAppApplicationTests {
    @Autowired
    private Utils utils;

    @BeforeEach
    void setUp() throws IOException {
        RestAssured.baseURI = "http://localhost:8080";
        utils.initDB();
    }

    /**
     * Check if all the users in the json are correctly insert in the db
     * IN particular, they shall be 5.
     */
    @Test
    @DirtiesContext(methodMode = DirtiesContext.MethodMode.AFTER_METHOD)
    public void initDBTest() {
        List<UserRegistred> userRegistredList = (List<UserRegistred>) utils.getUserRegistredRepository().findAll();
        List<Exam> examList = (List<Exam>) utils.getExamRepository().findAll();
        assertEquals(userRegistredList.size(), 5);
        assertEquals(examList.size(), 13);
    }

}

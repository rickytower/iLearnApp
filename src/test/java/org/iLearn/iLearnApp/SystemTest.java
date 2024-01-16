package org.iLearn.iLearnApp;

import io.restassured.RestAssured;
import org.iLearn.iLearnApp.model.entity.Course;
import org.iLearn.iLearnApp.model.entity.Exam;
import org.iLearn.iLearnApp.model.entity.UserRegistred;
import org.iLearn.iLearnApp.pageObjects.LoginObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.DependsOn;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DependsOn("BaseTest")
class SystemTest extends BaseTest{

    /**
     * Check if all the users in the json are correctly insert in the db
     * IN particular, they shall be 5.
     */
    @Test
    @DirtiesContext(methodMode = DirtiesContext.MethodMode.AFTER_METHOD)
    public void initDBTest() {
        List<UserRegistred> userRegistredList = (List<UserRegistred>) utils.getUserRegistredRepository().findAll();
        List<Exam> examList = (List<Exam>) utils.getExamRepository().findAll();
        List<Course> courseList = (List<Course>) utils.getCourseRepository().findAll();
        assertEquals(userRegistredList.size(), 5);
        assertEquals(examList.size(), 13);
        assertEquals(courseList.size(), 6);
    }

    @Test
    @DirtiesContext(methodMode = DirtiesContext.MethodMode.AFTER_METHOD)
    public void login(){
        driver.get("http://localhost:8080");
        LoginObject loginObject = new LoginObject(driver);
        loginObject.loginUser("mariano","ceccato");
        loginObject.submit(driver);
    }

}

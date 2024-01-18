package org.iLearn.iLearnApp;

import org.iLearn.iLearnApp.model.entity.Course;
import org.iLearn.iLearnApp.model.entity.Exam;
import org.iLearn.iLearnApp.model.entity.UserRegistred;
import org.iLearn.iLearnApp.pageObjects.LoginObject;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.DependsOn;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DependsOn("BaseTest")
public class SystemTest extends BaseTest {

    /**
     * Check if all the users in the json are correctly insert in the db
     * IN particular, they shall be 5.
     */


    @Test
    @DirtiesContext(methodMode = DirtiesContext.MethodMode.BEFORE_METHOD)
    public void initDBTest() {
        List<UserRegistred> userRegistredList = (List<UserRegistred>) utils.getUserRegistredRepository().findAll();
        List<Exam> examList = (List<Exam>) utils.getExamRepository().findAll();
        List<Course> courseList = (List<Course>) utils.getCourseRepository().findAll();
        assertEquals(userRegistredList.size(), 5);
        assertEquals(examList.size(), 13);
        assertEquals(courseList.size(), 6);
    }

    @Test
    @DirtiesContext(methodMode = DirtiesContext.MethodMode.BEFORE_METHOD)
    public void login() {
        driver.get("http://localhost:8080");
        System.out.println(driver);
        LoginObject loginObject = new LoginObject(driver);
        loginObject.loginUser("mariano","ceccato");
        loginObject.submit(driver);
    }

}

package org.iLearn.iLearnApp;

import org.iLearn.iLearnApp.model.entity.Course;
import org.iLearn.iLearnApp.model.entity.Exam;
import org.iLearn.iLearnApp.model.entity.UserRegistred;
import org.iLearn.iLearnApp.pageObjects.LoginObject;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.DependsOn;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DependsOn("BaseTest")
public class SystemTest extends BaseTest {

    /**
     * Check if all the users in the json are correctly insert in the db
     * IN particular, they shall be 5.
     */

    @Test
    public void initDBTest() {
        List<UserRegistred> userRegistredList = (List<UserRegistred>) DBUtils.getUserRegistredRepository().findAll();
        List<Exam> examList = (List<Exam>) DBUtils.getExamRepository().findAll();
        List<Course> courseList = (List<Course>) DBUtils.getCourseRepository().findAll();
        assertEquals(5,userRegistredList.size() );
        assertEquals(13,examList.size() );
        assertEquals(6, courseList.size());
    }

    @Test
    public void login() {
        driver.get(getBaseUrl());
        LoginObject loginObject = new LoginObject(driver);
        loginObject.loginUser("mariano","ceccato");
        loginObject.submit(driver);
    }

}

package org.iLearn.iLearnApp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.DependsOn;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DependsOn("BaseTest")
public class LoginTests extends BaseTest{
    @Test
    public void loginAsPROFESSOR() {
        driver.get("http://localhost:8080/");
    }

    @Test
    public void loginAsStiudent() {
        driver.get("http://localhost:8080/");
    }
}

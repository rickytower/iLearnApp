package org.iLearn.iLearnApp;


import io.restassured.RestAssured;
import org.apache.commons.lang3.SystemUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.nio.file.Paths;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public abstract class BaseTest {

    @Autowired
    protected Utils utils;
    protected WebDriver driver;

    @Before
    public void setUp() throws IOException {
        org.openqa.selenium.firefox.FirefoxOptions firefox_options = new FirefoxOptions();
        //firefox_options.addArguments("--headless");
        if(SystemUtils.IS_OS_WINDOWS){
            System.setProperty("webdriver.gecko.driver",
                    Paths.get("src/test/resources/geckodriver-v0.33.0-win64/geckodriver.exe").toString());
        }
        else if (SystemUtils.IS_OS_MAC){
            System.setProperty("webdriver.gecko.driver",
                    Paths.get("src/test/resources/geckodriver-v0.33.0-macos/geckodriver").toString());
        }
        else if (SystemUtils.IS_OS_LINUX){
            System.setProperty("webdriver.gecko.driver",
                    Paths.get("src/test/resources/geckodriver-v0.33.0-linux64/geckodriver").toString());
        }
        if (driver == null)
            driver = new FirefoxDriver(firefox_options);
    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

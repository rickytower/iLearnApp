package org.iLearn.iLearnApp;


import org.apache.commons.lang3.SystemUtils;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.nio.file.Paths;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public abstract class BaseTest {

    @Autowired
    protected DBUtils DBUtils;
    protected static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        org.openqa.selenium.firefox.FirefoxOptions firefox_options = new FirefoxOptions();
        firefox_options.addArguments("--headless");
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
                    Paths.get("src/test/resources/geckodriver-v0.34.0-linux64/geckodriver").toString());
        }
        if (driver == null)
            driver = new FirefoxDriver(firefox_options);
    }
    @BeforeEach
    @DirtiesContext(methodMode = DirtiesContext.MethodMode.BEFORE_METHOD)
    void reinitializeDB(){
        DBUtils.dropDataDB();
        DBUtils.initDB();
    }

    public String getBaseUrl() {
        return "http://localhost:8080";
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

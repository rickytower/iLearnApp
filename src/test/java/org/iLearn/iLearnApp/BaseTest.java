package org.iLearn.iLearnApp;


import org.apache.commons.lang3.SystemUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.nio.file.Paths;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public abstract class BaseTest {

    protected WebDriver driver;

    @Before
    public void setUp() {
        org.openqa.selenium.firefox.FirefoxOptions firefox_options = new FirefoxOptions();
        firefox_options.addArguments("--headless");
        if (SystemUtils.IS_OS_LINUX){
            System.setProperty("webdriver.firefox.driver",
                    Paths.get("src/test/resources/geckodriver").toString());
        }
    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

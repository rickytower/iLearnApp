package org.iLearn.iLearnApp;

import org.iLearn.iLearnApp.pageObjects.ProfileObject;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfileTest extends BaseTest  {
    @Test
    public void profileEdit() {
        driver.get(getBaseUrl() + "/profile/2");

        ProfileObject profileObject = new ProfileObject(driver);

        driver.findElement(By.id("editButton")).click();

        assertEquals("/editProfile/2",driver.getCurrentUrl());

        profileObject.edit("email@prova.it","123prova123","Via di prova 1", "Prova city");

        assertEquals("/profile/2", driver.getCurrentUrl());
    }
}

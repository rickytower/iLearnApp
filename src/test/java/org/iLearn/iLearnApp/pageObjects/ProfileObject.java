package org.iLearn.iLearnApp.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileObject extends PageObject {
    @FindBy(xpath = "//button[@id=editButton]")
    private WebElement editButton;

    public ProfileObject(WebDriver driver){
        super(driver);
    }

    public void edit(String email, String phoneNumber, String address, String city){

    }
}

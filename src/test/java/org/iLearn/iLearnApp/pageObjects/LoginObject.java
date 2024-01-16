package org.iLearn.iLearnApp.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObject extends PageObject {
    @FindBy(xpath = "//input[@id='username']")
    private WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submit;

    public LoginObject(WebDriver driver) {
        super(driver);
    }

    public void loginUser(String username, String password){
        this.username.clear();
        this.password.clear();
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }
    public ProfileObject submit(WebDriver driver){
        submit.click();
        return new ProfileObject(driver);
    }



}

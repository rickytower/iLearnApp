package org.iLearn.iLearnApp.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileObject extends PageObject {
    public ProfileObject(WebDriver driver){
        super(driver);
    }

    /**
     * Profile page elements
     */
    @FindBy(xpath = "//button[@id=editButton]")
    private WebElement editButton;


    /**
     * Profile edit elements
     */
    @FindBy(id = "//input[@id=emailInput]")
    private WebElement emailInput;

    @FindBy(id = "//input[@id=telephoneNumberInput]")
    private WebElement telephoneNumberInput;

    @FindBy(id = "//input[@id=addressInput]")
    private WebElement addressInput;

    @FindBy(id = "//input[@id=cityInput]")
    private WebElement cityInput;

    @FindBy(id = "submitButton")
    private WebElement submitButton;




    /**
     * Profile edit page action
     */

    public void edit(String email, String phoneNumber, String address, String city) {
        clearAndType(emailInput, email);
        clearAndType(telephoneNumberInput, phoneNumber);
        clearAndType(addressInput, address);
        clearAndType(cityInput, city);
        submitButton.click();
    }

    private void clearAndType(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }
}

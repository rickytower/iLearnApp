package org.iLearn.iLearnApp.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileObject extends PageObject {

    /**
     * Profile page elements
     */
    @FindBy(xpath = "//button[@id=editButton]")
    private WebElement editButton;

    @FindBy(xpath = "//span[@id=email]")
    private WebElement email;

    @FindBy(xpath = "//span[@id=telephoneNumber]")
    private WebElement telephoneNumber;

    @FindBy(xpath = "//span[@id=address]")
    private WebElement address;

    @FindBy(xpath = "//span[@id=city]")
    private WebElement city;


    /**
     * Profile edit elements
     */
    @FindBy(xpath = "//input[@id=emailInput]")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id=telephoneNumberInput]")
    private WebElement telephoneNumberInput;

    @FindBy(xpath = "//input[@id=addressInput]")
    private WebElement addressInput;

    @FindBy(xpath = "//input[@id=cityInput]")
    private WebElement cityInput;

    @FindBy(xpath = "//button[@id=submitButton]")
    private WebElement submitButton;


    public ProfileObject(WebDriver driver){
        super(driver);
    }


    /**
     * Profile page action
     */
    public void clickEditButton(){
        editButton.click();
    }
    /**
     * Profile edit page action
     */

    public void edit(String email, String phoneNumber, String address, String city) {
        clearAndType(emailInput, email);
        clearAndType(telephoneNumberInput, phoneNumber);
        clearAndType(addressInput, address);
        clearAndType(cityInput, city);
    }

    public void submit(){
        submitButton.click();
    }


}

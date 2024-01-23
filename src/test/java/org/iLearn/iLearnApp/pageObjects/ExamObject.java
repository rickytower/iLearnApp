package org.iLearn.iLearnApp.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExamObject extends PageObject{

    /**
     * Exam book related xpath:
     */
    @FindBy(xpath = "//table[@id='acceptedExamsTable']")
    private WebElement acceptedExamsTable;

    @FindBy(xpath = "//table[@id='pendingExamsTable']")
    private WebElement pendingExamsTable;

    /**
     * Exam list related xpath:
     *
     */

    @FindBy(xpath = "//table[@id='availableExamsTable']")
    private WebElement availableExamsTable;
    public ExamObject(WebDriver driver) {
        super(driver);
    }


    /**
     *
     * Exam in which I can enroll related xpath:
     */


    /**
     *
     * Exam in which I am enrolled related xpath:
     */


    /**
     * _______________________________________________________________________
     * _______________________________________________________________________
     * _______________________________________________________________________
     */


    /**
     * Exam book related methods:
     */
    public WebElement getAcceptButtonById(String examId) {
        String acceptButtonId = "acceptExamButton_" + examId;
        return acceptedExamsTable.findElement(By.id(acceptButtonId));
    }

    public WebElement getDeclineButtonById(String examId) {
        String declineButtonId = "declineExamButton_" + examId;
        return pendingExamsTable.findElement(By.id(declineButtonId));
    }

    /**
     * Exam list related method:
     */
    public WebElement getEnrollButtonById(String examId) {
        String enrollButtonId = "enrollExamButton" + examId;
        return availableExamsTable.findElement(By.id(enrollButtonId));
    }

    /**
     *
     * Exam in which I can enroll related methods:
     */


    /**
     *
     * Exam in which I am enrolled related methods:
     */
}

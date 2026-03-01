package com.automation.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.ui.base.BaseSetup;

import java.time.Duration;

public class AddRemovePage extends BaseSetup {
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor receives the WebDriver instance
    public AddRemovePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Locator for clicking on page link
    private By pageLink = By.xpath("//a[text()='Add/Remove Elements']");

    // Locator for Add Element button
    private By addElementButton = By.xpath("//button[text()='Add Element']");

    // Locator for Delete button
    private By deleteButton = By.xpath("//button[text()='Delete']");

    // Page Actions

    public void open() {
        driver.get("https://the-internet.herokuapp.com");
    }

    public void clickPageLink(){
        driver.findElement(pageLink).click();
    }

    public void clickAddElement() {
        driver.findElement(addElementButton).click();
    }

    public boolean isDeleteButtonDisplayed() {
        WebElement deleteBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(deleteButton));
        return deleteBtn.isDisplayed();
    }
    
    // Optionally: method to click delete button if needed
    public void clickDeleteButton() {
        driver.findElement(deleteButton).click();
    }
}
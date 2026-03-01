package com.automation.ui.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BasicAuthPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public BasicAuthPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By successMessage = By.xpath("//p[text()='Congratulations! You must have the proper credentials.']");
    
    public void open(){
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }

    public boolean isSuccessMessageDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).isDisplayed();
    }


}

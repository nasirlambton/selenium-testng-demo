package com.automation.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.automation.ui.base.BasePage;

public class AddRemovePage extends BasePage {

    private By addElementButton = By.xpath("//button[text()='Add Element']");
    private By deleteButton = By.xpath("//button[text()='Delete']");

    public AddRemovePage(WebDriver driver) {
        super(driver);
    }

    public void openAddRemovePage() {
    driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
}

    public void clickAddElement() {
        click(addElementButton);
    }

    public boolean isDeleteButtonDisplayed() {
        return isDisplayed(deleteButton);
    }
}
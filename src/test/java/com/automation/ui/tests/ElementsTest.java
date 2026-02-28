package com.automation.ui.tests;

import com.automation.ui.base.BaseSetup;
import com.automation.ui.pages.AddRemovePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsTest extends BaseSetup {
    @BeforeMethod
    public void setupBrowser() {
        setup();
    }

    @Test
    public void verifyAddRemoveButton() {
        AddRemovePage page = new AddRemovePage(driver);

        page.open();
        page.clickAddElement();

        Assert.assertTrue(page.isDeleteButtonDisplayed(), "Delete button is not displayed");
    }

    @AfterMethod
    public void cleanup() {
        teardown(); 
    }
}
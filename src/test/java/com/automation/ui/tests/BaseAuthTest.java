package com.automation.ui.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.automation.ui.base.BaseSetup;
import com.automation.ui.pages.BasicAuthPage;

public class BaseAuthTest extends BaseSetup{

    @BeforeMethod
    public void setupBrowser(){
        setup();
    }

    @Test
    public void verifyText(){
        BasicAuthPage basicAuthPage = new BasicAuthPage(driver);
        
        basicAuthPage.open();
        Assert.assertTrue(basicAuthPage.isSuccessMessageDisplayed(),"Success Message is NOT Displayed");
    }

}

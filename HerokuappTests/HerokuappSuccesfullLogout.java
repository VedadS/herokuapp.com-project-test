package HerokuappTests;

import BaseTestHerokuapp.BaseHerokuapp;
import HerokuappPage.HerokuappLoginPage;
import HerokuappPage.HerokuappSecureAreaPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HerokuappSuccesfullLogout extends BaseHerokuapp {
    HerokuappSecureAreaPage herokuappSecureAreaPage;
    HerokuappLoginPage herokuappLoginPage;

    @Before
    public void setUpTest(){
        herokuappSecureAreaPage = new HerokuappSecureAreaPage();
        herokuappLoginPage = new HerokuappLoginPage();
    }
    @Test
    public void succesfullLogoutTest(){
        herokuappLoginPage.usernameInputFieldSendKeys("tomsmith")
                .passwordInputFieldSendKeys("SuperSecretPassword!")
                .loginButtonClick();
        herokuappSecureAreaPage.logoutButtonClick();
        Assert.assertTrue(herokuappLoginPage.succesfullLogoutMessageIsDisplayed());
        Assert.assertEquals("\n" +
                "            You logged out of the secure area!\n" +
                "            ",herokuappLoginPage.succesfullLogoutMessageGetText());
    }
}

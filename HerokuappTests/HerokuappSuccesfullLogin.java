package HerokuappTests;

import BaseTestHerokuapp.BaseHerokuapp;
import HerokuappPage.HerokuappLoginPage;
import HerokuappPage.HerokuappSecureAreaPage;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class HerokuappSuccesfullLogin extends BaseHerokuapp {
    HerokuappLoginPage herokuappLoginPage;
    HerokuappSecureAreaPage herokuappSecureAreaPage;

    @Before
    public void setUpTest(){
        herokuappLoginPage = new HerokuappLoginPage();
        herokuappSecureAreaPage = new HerokuappSecureAreaPage();
    }
    @Test
    public void SuccesfullLogin(){
        herokuappLoginPage.usernameInputFieldSendKeys("tomsmith")
        .passwordInputFieldSendKeys("SuperSecretPassword!")
        .loginButtonClick();
        assertTrue(herokuappSecureAreaPage.secureAreaLoginMessageIsDisplayed());
        assertEquals("\n" +
                "            You logged into a secure area!\n" +
                "            ",herokuappSecureAreaPage.secureAreaLoginMessageGetText());
    }
}

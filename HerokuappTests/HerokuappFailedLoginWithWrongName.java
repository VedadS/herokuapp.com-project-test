package HerokuappTests;

import BaseTestHerokuapp.BaseHerokuapp;
import HerokuappPage.HerokuappLoginPage;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class HerokuappFailedLoginWithWrongName extends BaseHerokuapp {
    HerokuappLoginPage herokuappLoginPage;

    @Before
    public void setUpTest(){
        herokuappLoginPage = new HerokuappLoginPage();
    }
    @Test
    public void failedLoginWrongName(){
        herokuappLoginPage.usernameInputFieldSendKeys("Vedad")
                .passwordInputFieldSendKeys("SuperSecretPassword!")
                .loginButtonClick();
        assertTrue(herokuappLoginPage.failedUsernameIsDisplayed());
        assertEquals("\n" +
                "            Your username is invalid!\n" +
                "            ",herokuappLoginPage.failedUsernameGetText());
    }
}

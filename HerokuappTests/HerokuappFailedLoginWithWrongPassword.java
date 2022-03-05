package HerokuappTests;

import BaseTestHerokuapp.BaseHerokuapp;
import HerokuappPage.HerokuappLoginPage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HerokuappFailedLoginWithWrongPassword extends BaseHerokuapp {
    HerokuappLoginPage herokuappLoginPage;

    @Before
    public void setUpTest(){
        herokuappLoginPage = new HerokuappLoginPage();
    }
    @Test
    public void failedLoginWrongPassword(){
        herokuappLoginPage.usernameInputFieldSendKeys("tomsmith")
                .passwordInputFieldSendKeys("12345678")
                .loginButtonClick();
        assertTrue(herokuappLoginPage.failedUsernameIsDisplayed());
        assertEquals("\n" +
                "            Your password is invalid!\n" +
                "            ",herokuappLoginPage.failedUsernameGetText());
    }

}

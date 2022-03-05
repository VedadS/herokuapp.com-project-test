package HerokuappTests;

import BaseTestHerokuapp.BaseHerokuapp;
import HerokuappPage.HerokuappLoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HerokuappGitHub extends BaseHerokuapp {
    HerokuappLoginPage herokuappLoginPage;

    @Before
    public void setUpTest(){
        herokuappLoginPage = new HerokuappLoginPage();
    }
    @Test
    public void gitHubButtonTest(){
        herokuappLoginPage.gitHubButtonClick();
      String URL = driver.getCurrentUrl(); Assert.assertEquals(URL, "https://github.com/saucelabs/the-internet" );
    }
}

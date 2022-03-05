package BaseTestHerokuapp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseHerokuapp {
    public static WebDriver driver;
    public static WebDriverWait wdWait;
    public static Actions actions;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdWait = new WebDriverWait(driver,30);
        actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @After
    public void tearDown(){
        //TODO odkomentarisi ovu liniju kad zavrsis sa pisanjem testova
      driver.quit();
    }
}

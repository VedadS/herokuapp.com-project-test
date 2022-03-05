package HerokuappPage;

import BaseTestHerokuapp.BaseHerokuapp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HerokuappSecureAreaPage extends BaseHerokuapp {
    public HerokuappSecureAreaPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "flash")
    WebElement secureAreaSuccesfullLoginMessage;
    @FindBy(css = ".button.secondary.radius")
    WebElement logoutButton;


    public boolean secureAreaLoginMessageIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(secureAreaSuccesfullLoginMessage));
        return secureAreaSuccesfullLoginMessage.isDisplayed();

    }
    public String secureAreaLoginMessageGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(secureAreaSuccesfullLoginMessage));
        return secureAreaSuccesfullLoginMessage.getText();
    }
    public void logoutButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        logoutButton.click();
    }
}

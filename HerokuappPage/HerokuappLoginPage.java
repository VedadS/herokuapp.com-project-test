package HerokuappPage;

import BaseTestHerokuapp.BaseHerokuapp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HerokuappLoginPage extends BaseHerokuapp {
   public HerokuappLoginPage(){
       PageFactory.initElements(driver,this);
   }
    @FindBy(id = "username")
    WebElement usernameInputField;
    @FindBy(id = "password")
    WebElement passwordInputField;
    @FindBy(className = "radius")
    WebElement loginButton;
    @FindBy(id = "flash")
    WebElement failedLoginMessage;
    @FindBy(id = "flash")
    WebElement succesfullLogoutMessage;
    @FindBy(xpath = "//img[contains(@alt,'Fork me on GitHub') and contains(@alt,'Fork me on GitHub')]")
    WebElement gitHubButton;


   public HerokuappLoginPage usernameInputFieldSendKeys(String username){
       wdWait.until(ExpectedConditions.visibilityOf(usernameInputField));
       usernameInputField.clear();
       usernameInputField.sendKeys(username);
       return this;
   }
   public HerokuappLoginPage passwordInputFieldSendKeys(String password){
       wdWait.until(ExpectedConditions.visibilityOf(passwordInputField));
       passwordInputField.clear();
       passwordInputField.sendKeys(password);
       return this;
   }
   public HerokuappLoginPage loginButtonClick(){
       wdWait.until(ExpectedConditions.elementToBeClickable(loginButton));
       loginButton.click();
       return this;
   }
   public boolean failedUsernameIsDisplayed(){
       wdWait.until(ExpectedConditions.visibilityOf(failedLoginMessage));
       return failedLoginMessage.isDisplayed();
   }
   public String failedUsernameGetText(){
       wdWait.until(ExpectedConditions.visibilityOf(failedLoginMessage));
       return failedLoginMessage.getText();
   }
   public boolean succesfullLogoutMessageIsDisplayed(){
       wdWait.until(ExpectedConditions.visibilityOf(succesfullLogoutMessage));
       return succesfullLogoutMessage.isDisplayed();
   }
   public String succesfullLogoutMessageGetText(){
       wdWait.until(ExpectedConditions.visibilityOf(succesfullLogoutMessage));
       return succesfullLogoutMessage.getText();
   }
   public void gitHubButtonClick(){
       wdWait.until(ExpectedConditions.elementToBeClickable(gitHubButton));
       gitHubButton.click();
   }
}

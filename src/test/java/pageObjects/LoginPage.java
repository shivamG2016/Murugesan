package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Two things

    //  1 web Element creation with the help of web locator

    @FindBy(xpath="//input[@placeholder='Username']")
    WebElement txtUserName;

    @FindBy(xpath="//input[@placeholder='Password']")
    WebElement txtPassword;


    @FindBy(xpath="//button[@type='submit']")
    WebElement btnLogin;

//..........................................................................


// Actions( Always created with the help of Methods)

    public void setUserName(String username){
        txtUserName.sendKeys(username);
    }

    public void setPassword(String password){
        txtPassword.sendKeys(password);

    }

    public void clickONLoginButton(){

        btnLogin.click();
    }

}

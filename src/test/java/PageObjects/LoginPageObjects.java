package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

    public WebDriver Idriver;

    public void Loginpage(WebDriver rdriver){

        Idriver = rdriver;
        PageFactory.initElements(Idriver,this);

    }

    @FindBy(id="Email")
    @CacheLookup
    public static WebElement txtemail;

    @FindBy(id="Password")
    @CacheLookup
    public static  WebElement txtPassword;

    @FindBy(xpath="//*[text()='Log in']")
    @CacheLookup
    public static WebElement LoginButton;

    @FindBy(xpath="//*[text()='Logout']")
    @CacheLookup
    public static WebElement LogoutButton;

    public static void SetEmail(String Email){

        txtemail.clear();
        txtemail.sendKeys(Email);
    }

    public static void SetPassword(String password){

        txtPassword.clear();
        txtPassword.sendKeys(password);
    }


    public static void ClickLogin(){

        LoginButton.click();

    }

    public static void ClickLogout(){

        LogoutButton.click();

    }


}

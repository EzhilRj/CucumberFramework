package StepDefenitions;

import PageObjects.LoginPageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LoginSteps {

    public WebDriver driver;

    @Given("User Launch Browser")
    public void user_launch_browser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @When("User Open URL {string}")
    public void user_open_url(String url) {

        driver.get(url);

    }
    @When("User Enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String Email, String Password) {

        PageFactory.initElements(driver,LoginPageObjects.class);
        LoginPageObjects.SetEmail(Email);
        LoginPageObjects.SetPassword(Password);

    }

    @When("Click on Login")
    public void click_on_login() {

        PageFactory.initElements(driver,LoginPageObjects.class);
        LoginPageObjects.ClickLogin();

    }
    @Then("Page title should be {string}")
    public void page_title_should_be(String title) {

        if(driver.getPageSource().contains("Login was unsuccessful")){

            Assert.assertTrue(false);

        }else{

            Assert.assertEquals(title,driver.getTitle());

        }

    }

    @When("User Click Logout Button")
    public void user_click_logout_button() throws InterruptedException {

        LoginPageObjects.ClickLogout();
        Thread.sleep(5000);

    }

    @Then("Close Browser")
    public void close_browser() {

        driver.close();

    }


}

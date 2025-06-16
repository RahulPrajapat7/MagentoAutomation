package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import utils.BaseClass;
import org.junit.Assert;

import java.time.Duration;

public class LoginSteps {

    WebDriver driver = BaseClass.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    @Given("User navigates to login page")
    public void user_navigates_to_login_page() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
    }

    @When("User enters valid email and password")
    public void user_enters_valid_email_and_password() {
        loginPage.enterEmail("rahul123467@gmail.com");
        loginPage.enterPassword("Test@1234");
    }

    @And("User clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        loginPage.clickSignIn();
    }


    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {

        Assert.assertTrue("Login failed!", loginPage.isLoginSuccessful());
    }
}

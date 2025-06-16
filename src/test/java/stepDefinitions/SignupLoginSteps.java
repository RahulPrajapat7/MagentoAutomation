package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.SignupPage;
import utils.BaseClass;

public class SignupLoginSteps {

    WebDriver driver = BaseClass.getDriver();
    SignupPage signupPage = new SignupPage(driver);

    @Given("User launches the Magento signup page")
    public void user_launches_the_signup_page() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
    }

    @When("User enters first name, last name, email and password")
    public void user_enters_signup_details() {
        signupPage.enterDetails("Rahul", "Prajapati", "rahul1234@gmail.com", "Test@1234");
    }

    @When("User clicks on create an account")
    public void user_clicks_on_create_account() {
        signupPage.submitForm();
    }

    @Then("User account should be created successfully")
    public void user_account_should_be_created_successfully() {
        String title = driver.getTitle();
        if (!title.contains("My Account")) {
            throw new AssertionError("Account creation failed!");
        }
    }
}

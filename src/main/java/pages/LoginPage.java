package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath="//input[@id='email' and @name='login[username]']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='pass' and @name='login[password]']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[contains(@class,'action login primary')]")
    private WebElement signInButton;

    WebDriver.Timeouts driverTimeouts;

    @FindBy(xpath = "//a[@class='logo']")
    private WebElement Logo;

    // Actions
    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickSignIn() {
        signInButton.click();
    }

    public boolean isLoginSuccessful() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.visibilityOf(Logo));
            return Logo.isDisplayed();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

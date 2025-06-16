package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
    WebDriver driver;

    @FindBy(xpath = "//input[@id='firstname' and @name='firstname' ]")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='lastname' and @name='lastname' ]")
    WebElement lastName;
    @FindBy(xpath = "//input[@type='email' and @name='email' ]") WebElement email;
    @FindBy(xpath = "//input[@id='password' and @name='password' and @type='password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='password-confirmation' and @name='password_confirmation' and @type='password']") WebElement confirmPassword;
    @FindBy(xpath = "//button[@title='Create an Account']") WebElement createButton;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterDetails(String fName, String lName, String mail, String pass) {
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        email.sendKeys(mail);
        password.sendKeys(pass);
        confirmPassword.sendKeys(pass);
    }

    public void submitForm() {
        createButton.click();
    }
}

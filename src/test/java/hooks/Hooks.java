package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class Hooks {

    WebDriver driver;

    @Before
    public void setUp() {
        driver = BaseClass.getDriver();
        System.out.println("Browser launched before scenario");
    }

    @After
    public void tearDown() {
        BaseClass.quitDriver();
        System.out.println("Browser closed after scenario");
    }
}

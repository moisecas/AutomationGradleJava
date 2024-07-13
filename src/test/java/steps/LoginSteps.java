package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.elements.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.example.elements.utils.WebDriverManagerUtil;
import static org.junit.Assert.assertTrue;
public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("the user is on the Demoblaze login page")
    public void the_user_is_on_the_demoblaze_login_page() {
        driver = WebDriverManagerUtil.getDriver();
        driver.get("https://www.demoblaze.com/index.html");
        loginPage = new LoginPage(driver);
    }


}

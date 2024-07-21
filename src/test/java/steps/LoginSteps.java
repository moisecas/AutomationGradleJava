package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.elements.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.example.elements.utils.WebDriverManagerUtil;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("the user is one the Demoblaze login page")
    public void the_user_is_on_the_demoblaze_login_page() {
        driver = WebDriverManagerUtil.getDriver();
        driver.get("https://www.demoblaze.com/index.html");
        loginPage = new LoginPage(driver);
        // Abre el modal de inicio de sesión
        driver.findElement(By.xpath("//a[@id='login2']")).click();
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        loginPage.enterUsername("moisecas32"); //
        loginPage.enterPassword("123456");
    }

    @When("the user submits the login form")
    public void the_user_submits_the_login_form() {
        loginPage.submitLogin();
    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        assertTrue(loginPage.isLoginSuccessful());
        driver.quit();
    }

}

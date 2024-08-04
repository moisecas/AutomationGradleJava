package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.elements.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.example.elements.utils.WebDriverManagerUtil;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("the user is one the Demoblaze login page")
    public void the_user_is_on_the_demoblaze_login_page() {
        driver = WebDriverManagerUtil.getDriver();
        driver.get("https://www.demoblaze.com/index.html");
        loginPage = new LoginPage(driver);
        // Abre el modal de inicio de sesión
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click(); //espera hasta que el boton de login este clickeable
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //se crea un objeto WebDriverWait que espera hasta 10 segundos
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))); //espera hasta que el campo de usuario este visible
        loginPage.enterUsername("moisecas32");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
        loginPage.enterPassword("123456");
    }

    @When("the user submits the login form")
    public void the_user_submits_the_login_form() {
        loginPage.submitLogin();
    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        assertTrue(loginPage.isLoginSuccessful());
    }

}

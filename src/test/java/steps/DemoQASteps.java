package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DemoQASteps {
    private WebDriver driver;
    private WebDriverWait wait;

    public DemoQASteps() {
        WebDriverManager.chromedriver().setup(); // Set up ChromeDriver
        this.driver = new ChromeDriver(); // Initialize WebDriver
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set up an explicit wait of 10 seconds
    }

    @Given("the user navigates to the DemoQA homepage")
    public void the_user_navigates_to_the_DemoQA_homepage() {
        driver.get("https://demoqa.com/"); // Navigate to DemoQA homepage
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {
        String actualTitle = driver.getTitle(); // Get the page title
        assertEquals(expectedTitle, actualTitle); // Validate the page title
    }

    @Then("the URL should contain {string}")
    public void the_URL_should_contain(String expectedURLFragment) {
        String currentURL = driver.getCurrentUrl(); // Get the current URL
        assertTrue(currentURL.contains(expectedURLFragment));
    }
}

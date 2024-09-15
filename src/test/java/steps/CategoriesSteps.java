package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.elements.utils.WebDriverManagerUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.example.elements.pages.DemoBlazeHomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CategoriesSteps {
    private WebDriver driver;
    private DemoBlazeHomePage demoBlazeHomePage;

    @Given("the user is one the Demoblaze page")
    public void the_user_is_on_the_demoblaze_page() {
        driver.get("https://www.demoblaze.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    @When("I click on the {string} category")
    public void i_click_on_the_category(String category) {

        // Usa los métodos de HomePage según la categoría
        if (category.equalsIgnoreCase("Laptops")) {
            demoBlazeHomePage.clickOnLaptopsCategory();
        } else if (category.equalsIgnoreCase("Monitors")) {
            demoBlazeHomePage.clickOnMonitorsCategory();
        }
    }

    @Then("I should see the product list")
    public void i_should_see_the_products_in_the_product_list(String category) {
        DemoBlazeHomePage homePage = new DemoBlazeHomePage(driver);

        switch (category.toLowerCase()) {
            case "laptops":
                homePage.isSonyVaioI5Visible();
                break;
            case "monitors":
                homePage.isAppleMonitor24Visible();
                break;
            default:
                throw new IllegalArgumentException("Invalid category: " + category);
        }
    }

}

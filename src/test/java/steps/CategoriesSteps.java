package steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.elements.utils.WebDriverManagerUtil;
import org.openqa.selenium.WebDriver;
import org.example.elements.pages.DemoBlazeHomePage;


public class CategoriesSteps {
    private WebDriver driver;
    @When("I click on the {string} category")
    public void i_click_on_the_category(String category) {
        driver = WebDriverManagerUtil.getDriver();
        DemoBlazeHomePage homePage = new DemoBlazeHomePage(driver);

        // Usa los métodos de HomePage según la categoría
        if (category.equals("Laptops")) {
            homePage.clickOnLaptopsCategory();
        } else if (category.equals("Monitors")) {
            homePage.clickOnMonitorsCategory();
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

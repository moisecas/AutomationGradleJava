package automatedtest;

import org.example.elements.pages.CartPage;
import org.example.elements.pages.DemoBlazeHomePage;
import org.example.elements.pages.BasePage;
import org.example.elements.pages.DemoBlazeResultsPage;
import org.example.elements.pages.ProductPage;
import org.example.elements.utils.WebDriverManagerUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;
public class ECommerceTest {

    private WebDriver driver;
    private DemoBlazeHomePage homePage;
    private ProductPage productPage;
    private CartPage cartPage;

    @Before
    public void setUp() {
        driver = WebDriverManagerUtil.getDriver();
        driver.get("https://www.demoblaze.com/index.html"); // Abre la URL de la página principal
        homePage = new DemoBlazeHomePage(driver);
    }

    @Test
    public void testAddProductToCart() {
        homePage.goToProductPage();
        productPage = new ProductPage(driver);
        productPage.addToCart();
        cartPage = new CartPage(driver);
        cartPage.goToCart();

        // Imprimir el título de la página actual
        String pageTitle = cartPage.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Verificar que el título de la página contiene "Cart"
        assertTrue(pageTitle.contains("STORE"));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}

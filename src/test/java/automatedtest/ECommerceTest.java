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

    private WebDriver driver; //se inicializa el driver de chrome
    private DemoBlazeHomePage demoBlazeHomePage; //se inicializa la pagina de demoBlaze
    private ProductPage productPage; //se inicializa la pagina de producto
    private CartPage cartPage; //se inicializa la pagina de carrito

    @Before //se ejecuta antes de cada test
    public void setUp(){ //metodo que se encarga de inicializar el driver de chrome y la pagina de demoBlaze
        driver= WebDriverManagerUtil.getDriver();
        demoBlazeHomePage = new DemoBlazeHomePage(driver);
    }

    @Test //se ejecuta el test
    public void testAddToCart(){ //metodo que se encarga de agregar un producto al carrito
        demoBlazeHomePage.goToProductPage(); //se va a la pagina del producto
        productPage = new ProductPage(driver); //se inicializa la pagina del producto
        productPage.addToCart(); //se agrega el producto al carrito
        cartPage = new CartPage(driver); //se inicializa la pagina del carrito
        cartPage.goToCart(); //se va al carrito
        assertTrue(cartPage.getTitle().contains("Cart")); //se verifica que el titulo de la pagina contenga la palabra "Cart"
    }

    @After //se ejecuta despues de cada test
    public void tearDown(){ //metodo que se encarga de cerrar el driver de chrome
        if(driver != null){ //si el driver no es nulo
            driver.quit(); //se cierra el driver de chrome
        }
    }

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    private By cartLink = By.id("cartur");
    private By placeOrderButton = By.xpath("//button[text()='Place Order']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void openCart() {
        click(cartLink);
    }

    public void clickPlaceOrder() {
        click(placeOrderButton);
    }
}
package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.PlaceOrderPage;
import utils.DriverFactory;

public class CartSteps {
    WebDriver driver = DriverFactory.getDriver();
    CartPage cartPage = new CartPage(driver);
    PlaceOrderPage orderPage = new PlaceOrderPage(driver);

    @When("I add an item to the cart")
    public void addItemToCart() {
        driver.findElement(By.linkText("Samsung galaxy s6")).click();
        driver.findElement(By.linkText("Add to cart")).click();
        driver.switchTo().alert().accept();
    }

    @And("I go to cart and place an order")
    public void placeOrder() {
        cartPage.openCart();
        cartPage.clickPlaceOrder();
        orderPage.fillOrderForm("John Doe", "Israel", "Tel Aviv", "1234567890123456", "May", "2025");
    }

    @Then("I should see a purchase confirmation")
    public void verifyPurchaseConfirmation() {
        orderPage.verifyConfirmationDisplayed();
    }
}

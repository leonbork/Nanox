package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage extends BasePage {
    private By nameField = By.id("name");
    private By countryField = By.id("country");
    private By cityField = By.id("city");
    private By cardField = By.id("card");
    private By monthField = By.id("month");
    private By yearField = By.id("year");
    private By purchaseButton = By.xpath("//button[text()='Purchase']");
    private By confirmationModal = By.cssSelector(".sweet-alert.showSweetAlert.visible");

    public PlaceOrderPage(WebDriver driver) {
        super(driver);
    }

    public void fillOrderForm(String name, String country, String city, String card, String month, String year) {
        type(nameField, name);
        type(countryField, country);
        type(cityField, city);
        type(cardField, card);
        type(monthField, month);
        type(yearField, year);
        click(purchaseButton);
    }

    public void verifyConfirmationDisplayed() {
        waitForVisible(confirmationModal);
    }
}

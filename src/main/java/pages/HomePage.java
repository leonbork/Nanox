package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By loggedInUser = By.id("nameofuser");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void verifyUserLoggedIn() {
        waitForVisible(loggedInUser);
    }
}
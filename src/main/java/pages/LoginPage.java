package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By loginButton = By.id("login2");
    private By usernameField = By.id("loginusername");
    private By passwordField = By.id("loginpassword");
    private By confirmLoginButton = By.xpath("//button[text()='Log in']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        click(loginButton);
        waitForVisible(usernameField);
        type(usernameField, username);
        type(passwordField, password);
        click(confirmLoginButton);
    }
}

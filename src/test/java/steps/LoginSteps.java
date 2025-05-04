package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    @Given("I open the demoblaze home page")
    public void openHomePage() {
        driver.get("https://www.demoblaze.com");
    }

    @When("I login with username {string} and password {string}")
    public void login(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("I should see the user logged in successfully")
    public void verifyLogin() {
        homePage.verifyUserLoggedIn();
    }
}

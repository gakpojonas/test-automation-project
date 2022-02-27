package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String name){
        driver.findElement(usernameField).sendKeys(name);
    }

    public void enterPassword(String code){
        driver.findElement(passwordField).sendKeys(code);
    }

    public ProductsPage clickLogin(){
        driver.findElement(loginButton).click();
        return new ProductsPage(driver);
    }
}

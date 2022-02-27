package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartsPage {
    private WebDriver driver;
    private By backpack = By.xpath(".//div[text()='Sauce Labs Backpack']");
    private By onesie = By.xpath(".//div[text()='Sauce Labs Onesie']");
    private By jacket = By.xpath(".//div[text()='Sauce Labs Fleece Jacket']");
    private By checkout = By.id("checkout");

    public CartsPage(WebDriver driver){
        this.driver = driver;
    }

    public String getBackpackText(){
       return driver.findElement(backpack).getText();
    }

    public String getOnesieText(){
       return driver.findElement(onesie).getText();
    }

    public String getJacketText(){
       return driver.findElement(jacket).getText();
    }

    public CheckoutPage clickCheckout(){
        driver.findElement(checkout).click();
        return new CheckoutPage(driver);
    }
}

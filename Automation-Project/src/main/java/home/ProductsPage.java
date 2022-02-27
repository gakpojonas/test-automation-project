package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private WebDriver driver;
    private By productHead = By.className("title");
    private By backpack = By.id("add-to-cart-sauce-labs-backpack");
    private By onesie = By.id("add-to-cart-sauce-labs-onesie");
    private By fleeceJacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private By cart = By.id("shopping_cart_container");

    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    public String getText(){
        return driver.findElement(productHead).getText();
    }

    public void clickToAddBackpackToCart(){
        driver.findElement(backpack).click();
    }

    public void clickToAddOnesieToCart(){
        driver.findElement(onesie).click();
    }

    public void clickToAddFleeceJacketToCart(){
        driver.findElement(fleeceJacket).click();
    }

    public CartsPage clickCart(){
         driver.findElement(cart).click();
         return new CartsPage(driver);
    }
}

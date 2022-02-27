package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;
    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private By continueToOverview = By.id("continue");

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterFirstName(String FName){
        driver.findElement(firstName).sendKeys(FName);
    }

    public void enterLastName(String LName){
        driver.findElement(lastName).sendKeys(LName);
    }

    public void enterPostalCode(String code){
        driver.findElement(postalCode).sendKeys(code);
    }

    public OverviewPage clickContinue(){
        driver.findElement(continueToOverview).click();
        return new OverviewPage(driver);
    }
}

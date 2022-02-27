package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {
    private WebDriver driver;
    private By description = By.className("title");
    private By tax = By.className("summary_tax_label");
    private By total = By.className("summary_total_label");
    private By finish = By.id("finish");

    public OverviewPage(WebDriver driver){
        this.driver = driver;
    }

    public String getDescriptionText(){
        return driver.findElement(description).getText();
    }

    public String getTaxAmount(){
        return driver.findElement(tax).getText();
    }

    public String getTotalAmount(){
        return driver.findElement(total).getText();
    }

    public void clickFinish(){
        driver.findElement(finish).click();
    }
}

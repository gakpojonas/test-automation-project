package base;

import home.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTests {
    private WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        goHome();

        loginPage = new LoginPage(driver);

    }

    // Before any methods in a multiple text gets run
    @BeforeMethod
    public void goHome(){
        driver.get("https://www.saucedemo.com/ ");
    }
}

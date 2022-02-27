package base;

import home.CartsPage;
import home.CheckoutPage;
import home.OverviewPage;
import home.ProductsPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginPageTests extends BaseTests {

    @Test
    public void testForLoginPage(){

        String username = "standard_user";
        String password = "secret_sauce";
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        ProductsPage productsPage = loginPage.clickLogin();
        assertEquals(productsPage.getText(), "PRODUCTS",  "Message is incorrect");

        productsPage.clickToAddBackpackToCart();
        productsPage.clickToAddOnesieToCart();
        productsPage.clickToAddFleeceJacketToCart();
        CartsPage cartsPage =  productsPage.clickCart();

        assertEquals(cartsPage.getBackpackText(), "Sauce Labs Backpack",
                "Incorrect Text");
        assertEquals(cartsPage.getOnesieText(), "Sauce Labs Onesie",
                "Incorrect Text");
        assertEquals(cartsPage.getJacketText(), "Sauce Labs Fleece Jacket",
                "Incorrect Text");
        CheckoutPage checkoutPage = cartsPage.clickCheckout();

        checkoutPage.enterFirstName("John");
        checkoutPage.enterLastName("Doe");
        checkoutPage.enterPostalCode("00233");
        OverviewPage overviewPage = checkoutPage.clickContinue();

        assertEquals(overviewPage.getDescriptionText(), "CHECKOUT: OVERVIEW",
                "Incorrect Text");
        assertEquals(overviewPage.getTaxAmount(), "Tax: $7.04",
                "Incorrect Amount");
        assertEquals(overviewPage.getTotalAmount(), "Total: $95.01",
                "Incorrect Total Amount");
        overviewPage.clickFinish();
    }
}

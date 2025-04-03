package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Helper.Clicking.clickFunc;

public class CartPage {

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }


    //Locators
    By checkoutButton = By.cssSelector(".checkout-button.button.alt.wc-forward");


    //Actions
    public void clickCheckoutButton() {
        clickFunc(driver,checkoutButton,5);
    }
}

package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {


    // Generic method to wait for a condition
    public static void waitForCondition(WebDriver driver, ExpectedCondition<?> condition, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(condition);
    }



    // Specific method to wait for an element to be clickable
    public static void explicitWaitClickableLocator(WebDriver driver, By locator, int seconds) {
        waitForCondition(driver,ExpectedConditions.elementToBeClickable(locator),seconds);
    }

    // Specific method to wait for an element to be visible
    public static void explicitWaitVisibilityLocator(WebDriver driver,By locator, int seconds) {
        waitForCondition(driver,ExpectedConditions.visibilityOfElementLocated(locator),seconds);
    }

}

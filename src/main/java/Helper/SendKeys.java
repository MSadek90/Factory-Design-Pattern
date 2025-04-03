package Helper;

import org.openqa.selenium.*;

import java.util.NoSuchElementException;

import static Helper.Waits.explicitWaitVisibilityLocator;

public class SendKeys {

    // Method to send text to an element after ensuring it is visible
    public static void sendKeysFunc(WebDriver driver, By locator, String text,int seconds) {
        try {
            // Wait for the element to be visible
            explicitWaitVisibilityLocator(driver,locator,seconds);

            // Find the element and send the text
            WebElement element = driver.findElement(locator);
            element.sendKeys(text);
        }
        catch (NoSuchElementException e) {
            System.out.println("element not found: " + locator + e);
        }

        catch (StaleElementReferenceException e) {
            System.out.println("element stale: " + locator + e);
        }

        catch (ElementNotInteractableException e) {
            System.out.println("element not interactable: " + locator + e);
        }

        catch (Exception e) {
            throw new RuntimeException("Failed to click element: " + locator + e);
        }

    }
}

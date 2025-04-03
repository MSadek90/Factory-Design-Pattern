package Helper;

import org.openqa.selenium.*;

import java.util.NoSuchElementException;


import static Helper.Waits.explicitWaitClickableLocator;

public class Clicking {



    // Method to click an element after ensuring it is clickable
    public static void clickFunc(WebDriver driver, By locator,int seconds) {

        try {
            // Wait for the element to be clickable
            explicitWaitClickableLocator(driver, locator, seconds);

            // Find the element and click it
            WebElement element = driver.findElement(locator);
            element.click();
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

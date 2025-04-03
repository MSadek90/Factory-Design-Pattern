package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.NoSuchElementException;

import static Helper.Waits.explicitWaitVisibilityLocator;

public class SelectDropDown {

   //Select By Visible Text
    public static void selectFunc(WebDriver driver, By locator, String text) {

        try {
            explicitWaitVisibilityLocator(driver,locator,5);
            driver.findElement(locator);
            Select select = new Select(driver.findElement(locator));
            select.selectByVisibleText(text);
        }
        catch (NoSuchElementException e) {
            System.out.println("Element not found: " + locator + ": " + e.getMessage());
        }
    }
}

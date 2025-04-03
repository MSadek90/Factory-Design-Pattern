package Factory;

import org.openqa.selenium.WebDriver;

public abstract class DriverManagerAbstract {

    protected WebDriver driver;


    public abstract WebDriver initializeDriver();

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }

    public WebDriver getDriver() {
        if (driver == null) {
            driver = initializeDriver();
        }
        return driver;
    }

}

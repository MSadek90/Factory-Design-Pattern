package Base;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void getUrl(String endPoint) {
        driver.get("https://askomdch.com/" + endPoint);
    }
}

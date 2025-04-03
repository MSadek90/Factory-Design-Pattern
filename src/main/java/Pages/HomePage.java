package Pages;

import Base.BasePage;
import Helper.Clicking;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import static Helper.Clicking.clickFunc;

public class HomePage extends BasePage {




    public HomePage(WebDriver driver) {
        super(driver);
    }


    //Locators
    By storeMenuLink = By.cssSelector("#menu-item-1227 > a");



    //Actions
    public StorePage navigateToStorePage() {
        clickFunc(driver,storeMenuLink,5);
        return new StorePage(driver);
    }

    public HomePage getEndPoint(){
        getUrl("");
        return this;
    }


}

package Pages;

import Base.BasePage;
import Helper.SendKeys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import static Helper.Clicking.clickFunc;


public class StorePage extends BasePage {


    public StorePage(WebDriver driver) {
        super(driver);
    }



    //Locators
    private final By searchFld = By.id("woocommerce-product-search-field-0");
    private final By searchBtn = By.cssSelector("button[value='Search']");
    private final By title = By.cssSelector(".woocommerce-products-header__title.page-title");
    private final By addToCart= By.cssSelector(".button.product_type_simple.add_to_cart_button.ajax_add_to_cart");
    private final By viewCart = By.cssSelector(".added_to_cart.wc-forward");


    //Actions

    private StorePage enterTextInSearchFld(String txt){
        SendKeys.sendKeysFunc(driver,searchFld,txt,5);
        return this;
    }

    private void clickSearchBtn(){
        clickFunc(driver, searchBtn,5);
    }





    public StorePage searchFunc(String txt){
        enterTextInSearchFld(txt)
                .clickSearchBtn();
        return this;
    }



    public StorePage addToCartFunc(){
        clickFunc(driver, addToCart,5);
        return this;
    }



    public StorePage getEndPoint(){
        getUrl("Store");
        return this;
    }

    public CartPage viewCartFunc(){
        clickFunc(driver, viewCart,5);
        return new CartPage(driver);
    }


}

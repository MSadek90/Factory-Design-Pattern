package TestCases;

import Base.BaseTest;
import Pages.CartPage;
import Pages.StorePage;
import org.testng.annotations.Test;

public class AddToCartTests extends BaseTest {

    @Test
    public AddToCartTests AddToCartTestFromStorePage() {

        CartPage cartPage = new StorePage(driver)
                .getEndPoint()
                .addToCartFunc()
                .viewCartFunc();

        return this;
    }
}

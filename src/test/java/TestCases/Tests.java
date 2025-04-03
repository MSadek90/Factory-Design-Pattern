package TestCases;

import Base.BaseTest;
import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.StorePage;

import java.io.IOException;

import static Utilits.JacksonLIB.deserializeJson;
import Object.BillingAddress;



public class Tests extends BaseTest {
/*
    @Test
    public void test() throws IOException {
        /*
        new HomePage(driver)
                .clickStore();


        new StorePage(driver)
                .searchFunc("blue")
                .addToCartFunc()
                .viewCartFunc();


        new CartPage(driver)
                .clickCheckoutButton();




        BillingAddress billingAddress = deserializeJson("TestData/BillingAddressData.json", BillingAddress.class);


        new CheckoutPage(driver)
                .enterFirstName(billingAddress.getFirstName())
                .enterLastName(billingAddress.getLastName())
                .selectCountry(billingAddress.getCountry())
                .enterEmail(billingAddress.getAddress());


    }

    @Test
    public void test2() throws IOException {
        /*
        new HomePage(driver)
                .clickStore();


        new StorePage(driver)
                .searchFunc("blue")
                .addToCartFunc()
                .viewCartFunc();


        new CartPage(driver)
                .clickCheckoutButton();




        BillingAddress billingAddress = deserializeJson("TestData/BillingAddressData.json", BillingAddress.class);


        new CheckoutPage(driver)
                .enterFirstName(billingAddress.getFirstName())
                .enterLastName(billingAddress.getLastName())
                .selectCountry(billingAddress.getCountry())
                .enterEmail(billingAddress.getAddress());


    }

         */
}

package com.pages;

import com.BaseTestNopStationCart;
import com.util.GeneralUtil;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ShoppingCartPage extends BaseTestNopStationCart {

    //web element checkout button
    @AndroidFindBy(id = "btnCheckOut")
    WebElement checkoutBtn;

    //web element "continue as a guest"
    @AndroidFindBy(id = "btnGuestCheckout")
    WebElement continueGuestBtn;

    //constructor
    public ShoppingCartPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(GeneralUtil.LOAD_TIME)), this);
    }

     public ShoppingCartPage tapOnCheckoutBtn() {
        checkoutBtn.isDisplayed();
        checkoutBtn.click();
        return this;
    }

    public AddressPage tapOnContinueAsGuestBtn() {
        continueGuestBtn.isDisplayed();
        continueGuestBtn.click();
        return new AddressPage();
    }
}



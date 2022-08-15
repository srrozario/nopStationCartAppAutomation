package com.pages;

import com.BaseTestNopStationCart;
import com.util.GeneralUtil;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class OrderConfirmationPage extends BaseTestNopStationCart {

    @AndroidFindBy(id = "checkoutButton")
    WebElement confirmBtn;

    @AndroidFindBy(id = "md_button_positive")
    WebElement continueBtn;

    //constructor
    public OrderConfirmationPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(GeneralUtil.LOAD_TIME)), this);
    }

    public OrderConfirmationPage clickOnConfirmBtn(){
        confirmBtn.isDisplayed();
        confirmBtn.click();
        return this;
    }

    public HomePage clickOnContinueBtn(){
        continueBtn.isDisplayed();
        continueBtn.click();
        return new HomePage();
    }
}

package com.pages;

import com.BaseTestNopStationCart;
import com.util.GeneralUtil;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class PaymentInfoPage extends BaseTestNopStationCart {

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button")
    WebElement nextBtn;

    //constructor
    public PaymentInfoPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(GeneralUtil.LOAD_TIME)), this);
    }

    public OrderConfirmationPage clickOnNextBtn(){
        nextBtn.isDisplayed();
        nextBtn.click();
        return new OrderConfirmationPage();
    }
}

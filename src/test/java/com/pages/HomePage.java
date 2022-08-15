package com.pages;

import com.BaseTestNopStationCart;
import com.util.GeneralUtil;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HomePage extends BaseTestNopStationCart {
    @AndroidFindBy(id = "bottom_nav_categories")
    //@AndroidBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Category\"]/android.view.ViewGroup")
    WebElement categoryBtn;

    //constructor
    public HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(GeneralUtil.LOAD_TIME)), this);
    }

    public CategoryPage tapOnCategoryMenu() {
        categoryBtn.isDisplayed();
        categoryBtn.click();
        return new CategoryPage();
    }
}

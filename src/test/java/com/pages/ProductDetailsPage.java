package com.pages;

import com.BaseTestNopStationCart;
import com.util.GeneralUtil;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ProductDetailsPage extends BaseTestNopStationCart {
    //web element size
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup[1]/android.widget.TextView[3]")
    WebElement clickOnSize;

    //web element large type size
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[2]")
    WebElement clickOnLarge;

    //web element done button
    @AndroidFindBy(id = "tvDone")
    WebElement doneBtn;

    //web element quantity button
    @AndroidFindBy(id = "btnPlus")
    WebElement quantityBtn;

    //web element add to cart button
    @AndroidFindBy(id = "btnAddToCart")
    WebElement addToCartBtn;

    //cart menu icon
    @AndroidFindBy(id = "menu_cart")
    WebElement menuCartIcon;

    //constructor
    public ProductDetailsPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(GeneralUtil.LOAD_TIME)), this);
    }

    public ProductDetailsPage scrollAndTapOnSizeBtn() {
        scrollToMiddle();
        clickOnSize.isDisplayed();
        clickOnSize.click();
        return this;
    }

    public ProductDetailsPage tapOnSizeOptionSelection() {
        clickOnLarge.isDisplayed();
        clickOnLarge.click();
        return this;
    }

    public ProductDetailsPage tapOnDoneBtnClick() {
        doneBtn.isDisplayed();
        doneBtn.click();
        return this;
    }

    public ProductDetailsPage tapOnQuantityBtnClick() {
        quantityBtn.isDisplayed();
        quantityBtn.click();
        return this;
    }

    public ProductDetailsPage tapOnAddToCartBtnClick() {
        addToCartBtn.isDisplayed();
        addToCartBtn.click();
        return this;
    }

    public ShoppingCartPage tapOnCartIconClick() {
        menuCartIcon.isDisplayed();
        menuCartIcon.click();
        return new ShoppingCartPage();
    }
}

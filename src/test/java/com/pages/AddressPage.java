package com.pages;

import com.BaseTestNopStationCart;
import com.util.GeneralUtil;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class AddressPage extends BaseTestNopStationCart {

    @AndroidFindBy(id ="etFirstName")
    WebElement firstName;

    @AndroidFindBy(id ="etLastName")
    WebElement lastName;

    @AndroidFindBy(id ="etEmail")
    WebElement email;

    @AndroidFindBy(id ="countrySpinner")
    WebElement countryDropdownList;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
    WebElement selectingCountry;

    @AndroidFindBy(id ="stateSpinner")
    WebElement stateDropdownList;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
    WebElement selectingState;

    @AndroidFindBy(id ="etCompanyName")
    WebElement typeCompanyName;

    @AndroidFindBy(id ="etCity")
    WebElement typeCityName;


    @AndroidFindBy(id ="etStreetAddress")
    WebElement typeStreetName;

    @AndroidFindBy(id ="etZipCode")
    WebElement typeZipCode;

    @AndroidFindBy(id ="etPhone")
    WebElement typePhoneNumber;

    @AndroidFindBy(id ="btnContinue")
    WebElement continueBtn;

    //constructor
    public AddressPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(GeneralUtil.LOAD_TIME)), this);
    }

    public AddressPage insertFirstName (){
        firstName.isDisplayed();
        firstName.sendKeys("Sajib");
        return this;
    }

    public AddressPage insertLastName (){
        lastName.isDisplayed();
        lastName.sendKeys("Test");
        return this;
    }

    public AddressPage insertEmail (){
        email.isDisplayed();
        email.sendKeys("sajib@test.com");
        return this;
    }

    public AddressPage clickOnCountry (){
        countryDropdownList.isDisplayed();
        countryDropdownList.click();
        return this;
    }

    public AddressPage selectCountry (){
        selectingCountry.isDisplayed();
        selectingCountry.click();
        return this;
    }

    public AddressPage clickOnState (){
        stateDropdownList.isDisplayed();
        stateDropdownList.click();
        return this;
    }

    public AddressPage selectState (){
        selectingState.isDisplayed();
        selectingState.click();
        return this;
    }

    public AddressPage insertCompanyName (){
        typeCompanyName.isDisplayed();
        typeCompanyName.sendKeys("XYZ Ltd.");
        return this;
    }

    public AddressPage scrollAndInsertCity (){
        scrollToMiddle();
        typeCityName.isDisplayed();
        typeCityName.sendKeys("Test");
        return this;
    }

    public AddressPage insertStreetAddress (){
        typeStreetName.isDisplayed();
        typeStreetName.sendKeys("21 Test Street");
        return this;
    }

    public AddressPage insertZipCode (){
        typeZipCode.isDisplayed();
        typeZipCode.sendKeys("2142");
        return this;
    }

    public AddressPage insertPhoneNumber (){
        typePhoneNumber.isDisplayed();
        typePhoneNumber.sendKeys("24366142");
        return this;
    }

    public ShippingPage clickOnContinueBtn (){
        continueBtn.isDisplayed();
        continueBtn.click();
        return new ShippingPage();
    }
}

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
    WebElement firstNameEl;

    @AndroidFindBy(id ="etLastName")
    WebElement lastNameEl;

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

    public AddressPage insertFirstName (String firstName){
        firstNameEl.isDisplayed();
        firstNameEl.sendKeys(firstName);
        return this;
    }

    public AddressPage insertLastName (String lastName){
        lastNameEl.isDisplayed();
        lastNameEl.sendKeys(lastName);
        return this;
    }

    public AddressPage insertEmail (String emailAddress){
        email.isDisplayed();
        email.sendKeys(emailAddress);
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

    public AddressPage insertCompanyName (String company){
        typeCompanyName.isDisplayed();
        typeCompanyName.sendKeys(company);
        return this;
    }

    public AddressPage scrollAndInsertCity (String cityName){
        scrollToMiddle();
        typeCityName.isDisplayed();
        typeCityName.sendKeys(cityName);
        return this;
    }

    public AddressPage insertStreetAddress (String streetAddress){
        typeStreetName.isDisplayed();
        typeStreetName.sendKeys(streetAddress);
        return this;
    }

    public AddressPage insertZipCode (String zipCode){
        typeZipCode.isDisplayed();
        typeZipCode.sendKeys(zipCode);
        return this;
    }

    public AddressPage insertPhoneNumber (String phoneNumber){
        typePhoneNumber.isDisplayed();
        typePhoneNumber.sendKeys(phoneNumber);
        return this;
    }

    public ShippingPage clickOnContinueBtn (){
        continueBtn.isDisplayed();
        continueBtn.click();
        return new ShippingPage();
    }
}

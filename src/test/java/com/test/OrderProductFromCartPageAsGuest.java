package com.test;

import com.BaseTestNopStationCart;
import com.pages.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrderProductFromCartPageAsGuest extends BaseTestNopStationCart {
   HomePage homePage;


    @BeforeClass
    public void setup() {
        initialization();
        homePage = new HomePage();
        //shoppingCartPage =new HomePage().tapOnCategoryMenu().tapOnElectronics().scrollToMiddleOnElectronicsPage().tapOnNokiaProduct().tapOnSizeBtn().tapOnSizeOptionSelection().tapOnDoneBtnClick().tapOnQuantityBtnClick().tapOnAddToCartBtnClick().tapOnCartIconClick();
    }

    @Test
    public void test() {
        homePage = homePage
                .tapOnCategoryMenu()
                .tapOnElectronics()
                .scrollAndTapOnNokiaProduct()
                .scrollAndTapOnSizeBtn()
                .tapOnSizeOptionSelection()
                .tapOnDoneBtnClick()
                .tapOnQuantityBtnClick()
                .tapOnAddToCartBtnClick()
                .tapOnCartIconClick()
                .tapOnCheckoutBtn()
                .tapOnContinueAsGuestBtn()
                .insertFirstName()
                .insertLastName()
                .insertEmail()
                .clickOnCountry()
                .selectCountry()
                .clickOnState()
                .selectState()
                .insertCompanyName()
                .scrollAndInsertCity()
                .insertStreetAddress()
                .insertZipCode()
                .insertPhoneNumber()
                .clickOnContinueBtn()
                .scrollAndClickOnNextDayAir()
                .clickOnBtnContinue()
                .scrollAndClickOnMoneyOrderOption()
                .clickOnContinueBtn()
                .clickOnNextBtn()
                .clickOnConfirmBtn()
                .clickOnContinueBtn();
    }

    @AfterClass
    public void tearDown() {
        stopRecording();
        driver.quit();
    }
}
package com.test;

import com.BaseTestNopStationCart;
import com.pages.*;
import org.testng.annotations.*;

public class AddToCartProductAsGuestUser extends BaseTestNopStationCart {
   ProductDetailsPage productDetailsPage;

    @BeforeClass
    public void setup() {
        initialization();
        productDetailsPage = new HomePage().tapOnCategoryMenu().tapOnElectronics().scrollAndTapOnNokiaProduct();
        //shoppingCartPage =new HomePage().tapOnCategoryMenu().tapOnElectronics().scrollToMiddleOnElectronicsPage().tapOnNokiaProduct().tapOnSizeBtn().tapOnSizeOptionSelection().tapOnDoneBtnClick().tapOnQuantityBtnClick().tapOnAddToCartBtnClick().tapOnCartIconClick();
    }

    @Test
    public void test() {
        productDetailsPage = productDetailsPage
                .scrollAndTapOnSizeBtn()
                .tapOnSizeOptionSelection()
                .tapOnDoneBtnClick()
                .tapOnQuantityBtnClick()
                .tapOnAddToCartBtnClick();
    }

    @AfterClass
    public void tearDown() {
        stopRecording();
        driver.quit();
    }
}

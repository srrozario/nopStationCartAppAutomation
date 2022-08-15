package com.test;

import com.BaseTestNopStationCart;
import com.pages.*;
import org.testng.annotations.*;

public class AddToCartProductGuestUser extends BaseTestNopStationCart {
    ProductDetailsPage productDetailsPage;
    //ShoppingCartPage shoppingCartPage;

    @BeforeClass
    public void setup() {
        initialization();
        productDetailsPage = new HomePage().tapOnCategoryMenu().tapOnElectronics().scrollToMiddleOnElectronicsPage().tapOnNokiaProduct();
        //shoppingCartPage =new HomePage().tapOnCategoryMenu().tapOnElectronics().scrollToMiddleOnElectronicsPage().tapOnNokiaProduct().tapOnSizeBtn().tapOnSizeOptionSelection().tapOnDoneBtnClick().tapOnQuantityBtnClick().tapOnAddToCartBtnClick().tapOnCartIconClick();
    }

    @Test
    public void test() {
        productDetailsPage = productDetailsPage
                .tapOnSizeBtn()
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

package com.util;

import com.BaseTestNopStationCart;

public class GeneralUtil extends BaseTestNopStationCart {
    public static final int LOAD_TIME=30;
    public static void waitForDomStable() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

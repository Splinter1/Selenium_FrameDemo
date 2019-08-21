package com.lzz.actions;

import com.lzz.driver.AppDriver;

public class ClickXY extends AppDriver {
    public static void clickTimes (int times) {
        for (int i = 0; i < times; i++) {
            driver.tap(1, 500, 900, 100);
        }
    }
}

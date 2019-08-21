package com.lzz.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class AppDriver {
    public static AndroidDriver driver;

    public static AndroidDriver start() throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.BROWSER_NAME, "");
        cap.setCapability("platformName", "Android"); //指定测试平台
        cap.setCapability("deviceName", "841f846e"); //指定测试机的ID,通过adb命令`adb devices`获取
        cap.setCapability("platformVersion", "8.0");

        cap.setCapability("appPackage", "com.galaxyentertainment.gpcmobile");
        cap.setCapability("appActivity", "com.geg.gpcmobile.feature.splash.ui.activity.SplashActivity");
        cap.setCapability("automationName", "uiautomator2");
        cap.setCapability("appWaitActivity","com.geg.gpcmobile.feature.splash.ui.activity.SplashActivity");
        cap.setCapability("sessionOverride", true);

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
        return  driver;
    }

}

package com.lzz.actions;

import com.lzz.driver.AppDriver;
import com.lzz.driver.SeleniumDrive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class actionsTest extends AppDriver{
    @Test(priority = 1)
    public void setup()throws Exception{
        driver = AppDriver.start();
        }

    @Test(priority = 2)
    public void testClick()throws Exception{
        SeleniumDrive.open("chrome");
        SeleniumDrive.get("https://www.baidu.com/");
    }

    @Test(priority = 3)
    public void AppClick()throws Exception{
        AppActions.click(By.id("com.galaxyentertainment.gpcmobile:id/ok"));
        Thread.sleep(1000);
        ClickXY.clickTimes(5);
    }

    @Test(priority = 4)
    public void doubleClickTest()throws Exception {
        Actions.sendKeys(By.id("kw"),"测试");
        Actions.click(By.id("su"));
        SeleniumDrive.closedAll();
    }
}

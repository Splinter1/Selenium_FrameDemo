package com.lzz.actions;

import com.lzz.driver.SeleniumDrive;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class actionsTest {

    @Test
    public void testClick()throws Exception{
        SeleniumDrive.open("chrome");
        SeleniumDrive.get("https://www.baidu.com/");
        Actions.sendKeys(By.id("kw"),"测试");
        Actions.click(By.id("su"));
        Thread.sleep(3000);
        SeleniumDrive.closedAll();
    }
}

package com.lzz.actions;

import com.lzz.driver.SeleniumDrive;
import com.lzz.find.WebElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void getText()throws Exception{
        SeleniumDrive.open("chrome");
        SeleniumDrive.get("https://www.baidu.com/");

        //List<WebElement> links = WebElementUtils.findElements(By.className("mnav"));
        ArrayList list = Actions.getTexts(By.className("mnav"));

        for(int i = 0;i < list.size(); i ++){
            System.out.println(list.get(i));
        }
        SeleniumDrive.closedAll();
    }

    @Test
    public void doubleClickTest()throws Exception{
        WebDriver driver = SeleniumDrive.open("chrome");
        SeleniumDrive.get("https://www.baidu.com/");

        Actions.doubleClick(driver,By.id("su"));
        Thread.sleep(3000);
        SeleniumDrive.closedAll();
    }
}

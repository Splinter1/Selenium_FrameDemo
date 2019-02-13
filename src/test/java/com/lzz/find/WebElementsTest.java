package com.lzz.find;

import com.lzz.driver.SeleniumDrive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebElementsTest {

    @Test
    public void findTest(){
        WebDriver driver = SeleniumDrive.open("chrome");
        driver.get("file:///D:/Web%E8%87%AA%E5%8A%A8%E5%8C%96selenium+java/%E6%BA%90%E7%A0%81/webdriver_demo/selenium_html/index.html");
        WebElementUtils.findElement(By.className("wait")).click();
        String text = WebElementUtils.findElement(By.className("red")).getText();
        System.out.println(text);

        SeleniumDrive.closedAll();
    }
}

package com.lzz.find;

import com.lzz.driver.SeleniumDrive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementUtils extends SeleniumDrive {

    public static WebElement findElement(final By by){
        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }catch (Exception e){
            System.out.println("元素查找超时：" +by);
            e.printStackTrace();
        }
        element = driver.findElement(by);

        return element;
    }
}

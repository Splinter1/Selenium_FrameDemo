package com.lzz.actions;

import com.lzz.driver.SeleniumDrive;
import com.lzz.find.WebElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Actions extends SeleniumDrive {

    //点击事件
    public static void click(By by){
        WebElementUtils.findElement(by).click();
    }

    //输入文本
    public static void sendKeys(By by,String text){
        WebElement element = WebElementUtils.findElement(by);
        //先清空再输入
        element.clear();
        element.sendKeys(text);
    }




}

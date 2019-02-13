package com.lzz.actions;

import com.lzz.driver.SeleniumDrive;
import com.lzz.find.WebElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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

    //获取文本
    public static String getText(By by){
        String text = WebElementUtils.findElement(by).getText();
        return text;
    }

    //获取多个文本
    public static ArrayList getTexts(By by){
        ArrayList texts = new ArrayList();

        List<WebElement> list = WebElementUtils.findElements(by);
        for (int i = 0;i < list.size() ; i++){
            String text = list.get(i).getText();
            texts.add(text);
        }

        return texts;
    }

    //双击操作
    public static void doubleClick(WebDriver drive,By by){
        org.openqa.selenium.interactions.Actions actions;
        actions = new org.openqa.selenium.interactions.Actions(drive);
        WebElement element = WebElementUtils.findElement(by);
        actions.doubleClick(element).perform();
    }

}

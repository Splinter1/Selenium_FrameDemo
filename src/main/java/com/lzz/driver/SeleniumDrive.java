package com.lzz.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDrive {

    public static WebDriver driver;
    public static WebDriver open(String browser){

        String path = System.getProperty("user.dir");
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver",path +"/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browser.equals("ie")){
            System.setProperty("webdriver.ie.driver",path +"/drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }else if(browser.equals("firefox")){
            driver = new FirefoxDriver();
        }else{
            System.err.println("您传入的浏览器名称有误"+browser);
        }
        return driver;
    }

    public static void closedAll(){
        driver.quit();
    }


}

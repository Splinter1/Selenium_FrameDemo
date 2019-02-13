package com.lzz.driver;

import com.lzz.log4j.LoggerControler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDrive {

    final static LoggerControler log = LoggerControler.getlogger(SeleniumDrive.class);
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
//            System.err.println("您传入的浏览器名称有误"+browser);
            log.error("您传入的浏览器名称有误"+browser);
        }
        return driver;
    }

    public static void closedAll(){
        driver.quit();
    }

    public static void get(String url) throws Exception{
        if(url.startsWith("http")){
            driver.get(url);
            log.info("打开网站"+url);
        }else {
            throw new Exception("请输入正确的URL地址");
        }
    }

}

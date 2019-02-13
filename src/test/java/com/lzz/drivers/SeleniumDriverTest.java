package com.lzz.drivers;

import com.lzz.driver.SeleniumDrive;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SeleniumDriverTest {

    @Test
    public void openTest(){
        WebDriver driver = SeleniumDrive.open("chrome");
        SeleniumDrive.closedAll();
    }


}

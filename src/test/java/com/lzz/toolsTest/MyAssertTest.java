package com.lzz.toolsTest;

import com.lzz.actions.Actions;
import com.lzz.driver.SeleniumDrive;
import com.lzz.tool.MyAssert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MyAssertTest {
    @Test
    public void testCase() throws Exception {
        SeleniumDrive.open("chrome");
        SeleniumDrive.get("https://www.baidu.com/");

        MyAssert.assertEquals("123","1231");

        SeleniumDrive.closedAll();

    }
}

package com.lzz.log4jTest;

import com.lzz.log4j.LoggerControler;
import org.testng.annotations.Test;

public class TestLog4j {

    final static LoggerControler log = LoggerControler.getlogger(TestLog4j.class);
    @Test
    public void testcase(){
        log.info("这是info");
        log.debug("这是debug");
        log.error("这是error");
    }
}

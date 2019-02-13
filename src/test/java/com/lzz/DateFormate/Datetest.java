package com.lzz.DateFormate;

import com.lzz.tool.DataFormate;
import org.testng.annotations.Test;

public class Datetest {

    @Test
    public void testcase(){

        DataFormate.format(DataFormate.ZN_DATE_FORMAT);
    }
}

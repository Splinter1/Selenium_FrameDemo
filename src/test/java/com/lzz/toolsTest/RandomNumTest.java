package com.lzz.toolsTest;

import com.lzz.tool.ReandomNum;
import org.testng.annotations.Test;

public class RandomNumTest {

    @Test
    public void Rtest(){
        ReandomNum.getNumRandom(5);
    }
    @Test
    public void test(){
        ReandomNum.getNumRandom(10,20);
    }

    @Test
    public void test1(){
        ReandomNum.getStringRandom(5);
    }

}

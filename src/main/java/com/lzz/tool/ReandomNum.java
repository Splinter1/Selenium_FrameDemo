package com.lzz.tool;

import com.lzz.actions.Actions;
import com.lzz.log4j.LoggerControler;

import java.util.Random;

public class ReandomNum {
    final static LoggerControler log = LoggerControler.getlogger(Actions.class);

    //生成N位数的随机数
    public static String getNumRandom(int length){
        String num  = "";
        num = String .valueOf((long)(Math.random() * Math.pow(10 , length)));
        log.info("随机数为"+num);

        return num;
    }

    //生成限定范围随机数
    public static int getNumRandom(int min,int max){
        int num = 0;
        Random random = new Random();
//        min 10  max 20 ,  10~20
        num = random.nextInt(max-min) + min;

        log.info("随机数为"+num);
        return num;
    }

    //生成带字符的
    public static String getStringRandom(int length) {
        String val = "";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            String str = random.nextInt(2) % 2 == 0 ? "num" : "char";
            if ("char".equalsIgnoreCase(str)) { // 产生字母
                int nextInt = random.nextInt(2) % 2 == 0 ? 65 : 97;
                // System.out.println(nextInt + "!!!!"); 1,0,1,1,1,0,0
                val += (char) (nextInt + random.nextInt(26));
            } else if ("num".equalsIgnoreCase(str)) { // 产生数字
                val += String.valueOf(random.nextInt(10));
            }
        }
        log.info("随机数为"+val);
        return val;
    }
}

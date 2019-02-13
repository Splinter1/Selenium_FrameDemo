package com.lzz.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoggerControler {
    private static Logger logger = null;
    private static LoggerControler loggerControler = null;

    public static LoggerControler getlogger(Class<?> T){
        if(logger == null){
            //实例化Properties 类，处理配置文件
            Properties props = new Properties();
            try{
                String path = System.getProperty("user.dir");
                String  filepath = path+"/configs/log4j.properties";
                InputStream is = new FileInputStream(filepath);
                props.load(is);
            }catch(IOException e){
                e.printStackTrace();
            }
            PropertyConfigurator.configure(props);
            logger = Logger.getLogger(T);
            loggerControler = new LoggerControler();
        }
        return loggerControler;
    }
    public void info(String msg){
        logger.info(msg);
    }

    public void debug(String msg){
        logger.debug(msg);
    }

    public void warn(String msg){
        logger.warn(msg);
    }

    public void error(String msg){
        logger.error(msg);
    }

}

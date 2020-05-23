package com.jiankang.javaprogramminglogic.chapter24.v2;

/*
 *@create by jiankang
 *@date 2020/5/23 time 13:00
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurableStrategyDemo {
    public static IService createService() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("D:\\mystudy20190927\\mystudy\\src\\main\\java\\com\\jiankang\\javaprogramminglogic\\chapter24\\v2\\config.properties"));
        String className = prop.getProperty("service");
        Class<?> cls = Class.forName(className);
        return (IService) cls.newInstance();

    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        IService service = createService();
        service.action();
    }

}

package com.jiankang.javacoretechnologythetenversion.dchapter10.v10;

/*
 *@create by jiankang
 *@date 2020/7/28 time 17:04
 */

import java.lang.reflect.Method;

public class TestTool {
    public static void main(String[] args) {
        final NoBug testobj = new NoBug();
        final Class<? extends NoBug> clazz = testobj.getClass();
        final Method[] method = clazz.getDeclaredMethods();
        //用来记录测试产生的log信息
        final StringBuilder log = new StringBuilder();
        //记录异常次数
        int errornum = 0;

        for(Method m:method){
            if(m.isAnnotationPresent(Jiecha.class)){
                try {
                    m.setAccessible(true);
                    m.invoke(testobj,null);
                } catch (Exception e) {
                    errornum++;
                    log.append(m.getName());
                    log.append(" ");
                    log.append("has error");
                    log.append("\n\r caused by");
                    log.append(e.getCause().getClass().getSimpleName());
                    log.append("\n\r");
                    log.append(e.getCause().getMessage());
                    log.append("\n\r");
                }
            }
        }

        log.append(clazz.getSimpleName());
        log.append("has ");
        log.append(errornum);
        log.append(" error.");
        System.out.println(log.toString());
    }
}

package com.jiankang.improvejava151suggests.chapter9.v6;

/*
 *@create by jiankang
 *@date 2020/11/4 time 20:55
 */

import java.util.Calendar;

public class Task {

    public void doSomething(){
        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }
         StringBuffer sb = new StringBuffer();
        sb.append("线程名称： "+Thread.currentThread().getName());
        sb.append("，执行时间： "+ Calendar.getInstance().get(13)+"s");
        System.out.println(sb);
    }
}

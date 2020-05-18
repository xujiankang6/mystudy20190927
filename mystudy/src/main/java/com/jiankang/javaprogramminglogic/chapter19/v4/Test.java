package com.jiankang.javaprogramminglogic.chapter19.v4;

/*
 *@create by jiankang
 *@date 2020/5/16 time 19:29
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//解释为什么在多线程情况下，DateFormat线程不安全
public class Test {


    public static void main(String[] args) throws Exception {
        //放这里会报错
        final DateFormat format = new SimpleDateFormat("yyyyMMdd");
        Callable<Date> task = new Callable<Date>() {
            public Date call() throws Exception {

                //放这里不会报错，另一种解决方案为：  ThreadLocal进行初始化，见 下面的类
//                final DateFormat format = new SimpleDateFormat("yyyyMMdd");
                return format.parse("20101022");
            }
        };
        //pool with 5 threads
        ExecutorService exec = Executors.newFixedThreadPool(5);
        List<Future<Date>> results = new ArrayList<Future<Date>>();
        //perform 10 date conversions
        for (int i = 0; i < 100; i++) {
            results.add(exec.submit(task));
        }
        exec.shutdown();
        //look at the results
        for (Future<Date> result : results) {
            System.out.println(result.get());
        }
    }
}

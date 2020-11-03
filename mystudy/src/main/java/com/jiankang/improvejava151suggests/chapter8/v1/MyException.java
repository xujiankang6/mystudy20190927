package com.jiankang.improvejava151suggests.chapter8.v1;

/*
 *@create by jiankang
 *@date 2020/11/1 time 17:27
 */

import java.util.ArrayList;
import java.util.List;

public class MyException extends Exception {
    //容纳所有异常
    private List<Throwable> causes = new ArrayList<Throwable>();


    //构造函数，传递一个异常列表
    public MyException(List<? extends Throwable> _causes) {
        causes.addAll(_causes);
    }

    //读取所有的异常
    public List<Throwable> getExceptions() {
        return causes;
    }


}

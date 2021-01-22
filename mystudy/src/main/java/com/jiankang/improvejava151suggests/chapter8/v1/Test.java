package com.jiankang.improvejava151suggests.chapter8.v1;

/*
 *@create by jiankang
 *@date 2020/11/1 time 18:01
 */

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {



    }

    public static void doStuff() throws MyException{
        List<Throwable> list = new ArrayList<Throwable>();
        try {
            System.out.println("aa");
        }catch (Exception e){
            list.add(e);
        }
        try{
            System.out.println("bb");
        }catch (Exception e){
            list.add(e);
        }

        if(list.size()>0){
            throw new MyException(list);
        }
    }
}

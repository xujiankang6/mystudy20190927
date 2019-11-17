package com.jiankang.designismethod2.singleinstance.v2;

/*
 *@create by jiankang
 *@date 2019/11/2 time 19:17
 */

import java.util.ArrayList;
import java.util.Random;

public class Emperor {

    private static int maxNumberEmperor = 2;

    private static ArrayList<String> nameList = new ArrayList<String>();

    private static  ArrayList<Emperor> emperorArrayList=new ArrayList<Emperor>();

    private static int countNumOfEmperor = 0;
    static{
        for (int i = 0; i < 2; i++) {
            emperorArrayList.add(new Emperor("皇"+(i+1)+"帝"));
        }
    }

    private Emperor() {

    }

    private Emperor(String name) {
        nameList.add(name);
    }


    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmperor=random.nextInt(maxNumberEmperor);
        return emperorArrayList.get(countNumOfEmperor);
    }


    public static void say(){
        System.out.println(nameList.get(countNumOfEmperor));
    }



}

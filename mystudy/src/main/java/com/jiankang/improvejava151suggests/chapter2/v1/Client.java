package com.jiankang.improvejava151suggests.chapter2.v1;

/*
 *@create by jiankang
 *@date 2020/11/13 @time 15:34
 */


/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/13   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class Client {
    public static void main(String[] args) {
        //构造代码块碰到this只执行一次
        new Base();
        new Base("");
        new Base(1);
        System.out.println(Base.getNumOfObjects());

    }
}

class Base {

    //对象计算器
    private static int numOfObjects = 0;


    {
        //构造代码块，计算产生对象数量
        numOfObjects++;
    }

    public Base() {
    }

    public Base(String s) {
        this();
    }

    public Base(int _i) {

    }

    //返回创建了多少个实例
    public static int getNumOfObjects() {
        return numOfObjects;
    }
}

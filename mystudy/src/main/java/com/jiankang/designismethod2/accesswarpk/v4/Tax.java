package com.jiankang.designismethod2.accesswarpk.v4;

/*
 *@create by jiankang
 *@date 2020/1/12 time 20:51
 */

import java.util.Random;

public class Tax {

    public int getTax() {
        return (new Random()).nextInt(300);
    }
}

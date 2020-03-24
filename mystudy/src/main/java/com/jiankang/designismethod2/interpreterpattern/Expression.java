package com.jiankang.designismethod2.interpreterpattern;

/*
 *@create by jiankang
 *@date 2019/12/23 time 16:35
 */

import java.util.HashMap;

public abstract class Expression {
    public abstract int interpreter(HashMap<String,Integer> var);
}

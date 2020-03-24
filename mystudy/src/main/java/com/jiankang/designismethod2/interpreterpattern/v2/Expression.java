package com.jiankang.designismethod2.interpreterpattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/24 time 13:41
 */

/**
 * interpreter pattern
 */

public abstract class Expression {
    public abstract Object interpreter(Context ctx);
}

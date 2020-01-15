package com.jiankang.designismethod2.interpreterpattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/24 time 13:44
 */

public class TerminalExpression extends Expression {
    //通常终结符表达式，只有一个，但是有多个对象
    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
}

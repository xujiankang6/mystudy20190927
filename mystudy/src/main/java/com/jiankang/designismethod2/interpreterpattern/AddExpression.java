package com.jiankang.designismethod2.interpreterpattern;

/*
 *@create by jiankang
 *@date 2019/12/23 time 18:39
 */

import java.util.HashMap;

public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    //把左右两个表达式运算的结果加起来
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var)+super.right.interpreter(var);
    }
}

package com.jiankang.designismethod2.interpreterpattern;

/*
 *@create by jiankang
 *@date 2019/12/24 time 10:37
 */

import java.util.HashMap;

public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}

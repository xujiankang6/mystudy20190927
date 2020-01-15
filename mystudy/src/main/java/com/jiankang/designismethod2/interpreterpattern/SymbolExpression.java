package com.jiankang.designismethod2.interpreterpattern;

/*
 *@create by jiankang
 *@date 2019/12/23 time 18:34
 */

public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    //所有公式都只关心自己左右两个表达式的结果
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}

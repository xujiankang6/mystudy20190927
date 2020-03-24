package com.jiankang.designismethod2.interpreterpattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/24 time 13:45
 */

public class NonterminalExpression extends Expression {

    // 每个非终结符表达式都会对其他表达式产生依赖
    public NonterminalExpression(Expression... expressions) {

    }

    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
}

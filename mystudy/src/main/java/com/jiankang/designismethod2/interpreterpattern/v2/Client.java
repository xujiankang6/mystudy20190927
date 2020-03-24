package com.jiankang.designismethod2.interpreterpattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/24 time 13:52
 */


import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        //通常定一个语法容器，容纳一个具体的表达式，通常为ListArray,LinkedList,Stack etc.
        Stack<Expression> stack = null;
//        for(;;){
//            //进行语法判断，并产生递归调用
//        }
        // product a complate expression tree,by every concrete expression to analyse
        Expression exp = stack.pop();
        exp.interpreter(context);


    }
}

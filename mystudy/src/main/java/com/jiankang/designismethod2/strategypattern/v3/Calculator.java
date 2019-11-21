package com.jiankang.designismethod2.strategypattern.v3;

/*
 *@create by jiankang
 *@date 2019/11/21 time 15:24
 * 浓缩了策略模式的枚举
 */

public enum Calculator {
    //加法运算
    ADD("+") {
        public int exec(int a, int b) {
            return a + b;
        }
    },
    //减法运算
    SUB("-") {
        public int exec(int a, int b) {
            return a - b;
        }
    },
    MUL("*"){
        public int exec(int a, int b) {
            return a * b;
        }
    };

    String value = "";

    //定义成员类型
    private Calculator(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    //声明一个抽象函数
    public abstract int exec(int a, int b);
}

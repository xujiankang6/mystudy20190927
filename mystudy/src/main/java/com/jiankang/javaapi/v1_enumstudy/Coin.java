package com.jiankang.javaapi.v1_enumstudy;

/*
 *@create by jiankang
 *@date 2020/1/13 time 19:15
 */

/**
 * 枚举不能被final和abstract修饰
 */
public enum Coin {
    aaa(1), bbb(2), ccc(3);

    public int getValue() {
        return value;
    }

    private final int value;


    Coin(int value) {
        this.value = value;
    }


}

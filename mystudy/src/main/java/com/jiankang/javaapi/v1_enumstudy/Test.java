package com.jiankang.javaapi.v1_enumstudy;

/*
 *@create by jiankang
 *@date 2020/1/14 time 16:38
 */

import java.util.Arrays;

public class Test {
    enum CoinColor {COPPER, NICKEL, SILVER}
    static CoinColor color(Coin c){
        switch (c){
            case aaa:
                return CoinColor.COPPER;
            case bbb:
                return CoinColor.NICKEL;
            case ccc:
                return CoinColor.SILVER;
            default:
                throw new AssertionError("Unknow coin:"+c);
        }
    }

    public static void main(String[] args) {
        Coin aaa = Coin.valueOf("aaa");
        System.out.println(color(aaa));

    }
}

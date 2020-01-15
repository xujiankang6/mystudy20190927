package com.jiankang.effectivejavasecondedition.chapter2.v1;

/*
 *@create by jiankang
 *@date 2019/12/30 time 19:06
 */

public class Client {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts =new NutritionFacts.Builder(1,21).fat(23).sodium(11).build();
    }
}

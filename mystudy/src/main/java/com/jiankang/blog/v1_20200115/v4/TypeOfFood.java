package com.jiankang.blog.v1_20200115.v4;

/*
 *@create by jiankang
 *@date 2020/1/16 time 13:55
 */

public class TypeOfFood {
    public static void main(String[] args) {
        Food food = Food.Appetizer.SALAD;
        food = Food.MainCourse.LASAGNE;
        System.out.println(food);
    }
}

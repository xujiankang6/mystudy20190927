package com.jiankang.improvejava151suggests.chapter6.v1;

/*
 *@create by jiankang
 *@date 2020/10/27 time 16:34
 *
 *
 */

public class Test84 {

//    演示内置方法
    public static void main(String[] args) {
        System.out.println(SeasonEnum.getComfortableSeason());

//        使用switch时注意判断null
        describeEnum(null);




        for (SeasonEnum value : SeasonEnum.values()) {
            System.out.println(value);
        }

    }


    //接口常量写法
    public static void describe(int s) {
        //首先需要判断变量是否越界
        if (s >= 0 && s < 4) {
            switch (s) {
                case Season.Summer:
                    System.out.println("summer");
                    break;
                case Season.Autumn:
                    System.out.println("Autumn");
                    break;
            }

        }

    }


    public static void describeEnum(SeasonEnum s) {
//        最看重枚举的地方，在编译期间限制类型 不允许越界
        if(s!=null){
            switch (s) {
                case Summer:
                    System.out.println("summer");
                    break;
                case Autumn:
                    System.out.println("Autumn");
                    break;
            }
        }
    }

}

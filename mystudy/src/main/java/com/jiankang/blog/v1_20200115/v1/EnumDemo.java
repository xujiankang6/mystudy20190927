package com.jiankang.blog.v1_20200115.v1;

import java.util.Arrays;

/*
 *@create by jiankang
 *@date 2020/1/15 time 9:48
 */
public class EnumDemo {

    public static void main(String[] args){
        //创建枚举类型
        Day[] days = new Day[]{Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY,
                Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY};
        for(int i=0;i<days.length;i++){
            System.out.println(days[i].ordinal());
        }
        System.out.println("--------------------");
        System.out.println(days[0].compareTo(days[1]));

        Class<Day> declaringClass = days[0].getDeclaringClass();
        System.out.println(declaringClass);


        System.out.println(days[0].name());
        System.out.println(days[0].toString());
        //name，枚举
        Day day1 = Day.valueOf(Day.class, days[0].name());
        System.out.println(day1);

        //正常使用
        Day[] values = Day.values();
        //向上转型Enum
        Enum e = Day.MONDAY;
        Class<?> clasz = e.getDeclaringClass();
        if(clasz.isEnum()){
            Day[] enumConstants = (Day[]) clasz.getEnumConstants();
            System.out.println(Arrays.toString(enumConstants));
        }



    }

}
//定义枚举类型
enum Day {
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
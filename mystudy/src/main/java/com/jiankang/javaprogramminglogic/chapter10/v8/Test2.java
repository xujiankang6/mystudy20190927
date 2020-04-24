package com.jiankang.javaprogramminglogic.chapter10.v8;

/*
 *@create by jiankang
 *@date 2020/4/12 time 18:17
 */

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;

//这个枚举set可以作为一个案例
public class Test2 {
    public static void main(String[] args) {
        Worker[] workers = {
                new Worker("zhangsan", EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.FRIDAY)),
                new Worker("lisi", EnumSet.of(Day.TUESDAY, Day.THURSDAY, Day.SATURDAY)),
                new Worker("wangwu", EnumSet.of(Day.TUESDAY, Day.THURSDAY))
        };

        System.out.println("哪天一个人都不会来？");
        EnumSet<Day> days = EnumSet.allOf(Day.class);
        for(Worker worker:workers){
            days.removeAll(worker.getAvailableDays());
        }
        System.out.println(days);


        System.out.println("有哪些天至少会有一个人来？");
        EnumSet<Day> days2 = EnumSet.noneOf(Day.class);
        for(Worker worker:workers){
            days2.addAll(worker.getAvailableDays());
        }
        System.out.println(days2);

        System.out.println("有哪些天所有人都会来？");
        EnumSet<Day> days3 = EnumSet.allOf(Day.class);
        for(Worker worker:workers){
            days3.retainAll(worker.getAvailableDays());
        }
        System.out.println(days3);


        System.out.println("哪些人周一和周二都会来？");
        for(Worker worker:workers){
            if(worker.getAvailableDays().containsAll(EnumSet.of(Day.MONDAY,Day.TUESDAY))){
                System.out.println(worker.getName());
            }
        }


        System.out.println("有哪些天至少会有两个人来？");
        EnumMap<Day, Integer> dayObjectEnumMap = new EnumMap<>(Day.class);
        for(Worker worker:workers){
            for(Day day:worker.getAvailableDays()){
                //map求数量的简单方法，以后可以常用
                dayObjectEnumMap.merge(day, 1, Integer::sum);
            }
        }
        Set<Day> days1 = dayObjectEnumMap.keySet();
        for(Day day:days1){
            if(dayObjectEnumMap.get(day)>1){
                System.out.print(day+"  ");
            }
        }
        System.out.println("有哪些天所有人都会来，以便开会？");
        for(Day day:days1){
            if(dayObjectEnumMap.get(day)>2){
                System.out.print(day+"  ");
            }
        }
    }
}

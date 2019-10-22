package com.jiankang.java8book.collections;

/*
 *@create by jiankang
 *@date 2019/10/21 time 22:31
 */

import com.jiankang.java8book.bean.Dish;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Test {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));


        Integer collect = menu.stream().collect(reducing(0, Dish::getCalories, Integer::sum));
        System.out.println(collect);



        /*
        6.24广义的归约汇总
         */
        /*Integer reduce = menu.stream().map(Dish::getCalories).reduce(0, (i, j) -> i + j);
        System.out.println(reduce);
        Optional<Dish> mostCalorieDish = menu.stream().collect(reducing((d1,d2)->d1.getCalories()>d2.getCalories()?d1:d2));
        System.out.println(mostCalorieDish.get());*/

      /*  Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6).stream();
        List<Integer> numbers = stream.reduce(new ArrayList<Integer>(),
                (List<Integer> l, Integer e) -> {
                    l.add(e);
                    return l;
                },
                (List<Integer> l1, List<Integer> l2) -> {
                    l1.addAll(l2);
                    return l1;
                });
        System.out.println(numbers.toString());*/



        /*
        6.2.3 连接字符串
         */
//        String shortMenu = menu.stream().map(Dish::getName).collect(joining(", "));
//        System.out.println(shortMenu);





        /*
        6.2.2汇总
         */
       /* Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);
        Optional<Dish> mostCalorieDish = menu.stream().collect(maxBy(dishCaloriesComparator));
        int totalCalories = menu.stream().collect(summingInt(Dish::getCalories));
        double avgCalories = menu.stream().collect(averagingInt(Dish::getCalories));
        System.out.println(avgCalories);
        IntSummaryStatistics menuStatistics = menu.stream().collect(summarizingInt(Dish::getCalories));
        System.out.println(menuStatistics.toString());*/




   /*     long howManyDishes = menu.stream().count();
        howManyDishes = menu.stream().collect(counting());*/

    }


}

package com.jiankang.java8book.collections;

/*
 *@create by jiankang
 *@date 2019/10/21 time 22:31
 */

import com.jiankang.java8book.bean.Dish;
import com.jiankang.java8book.utils.PrimeNumbersCollector;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.partitioningBy;

public class Test {


    public static boolean isPrime(int candidate) {
        int candidateRoot = (int) Math.sqrt((double) candidate);
//        return takeWhile(primes, i -> i <= candidateRoot).stream().noneMatch(p -> candidate % p == 0);
        return IntStream.rangeClosed(2, candidateRoot).noneMatch(i -> candidate % i == 0);
//        return IntStream.range(2,candidate).noneMatch(i ->candidate%i ==0);
    }


    public Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n).boxed().collect(partitioningBy(candidate -> isPrime(candidate)));
    }

    public Map<Boolean, List<Integer>> partitionPrimesWithCustomCollector(int n) {
        return IntStream.rangeClosed(2, n).boxed().collect(new PrimeNumbersCollector());
    }

    public static void main(String[] args) {


           /*
        把数字分为质数和非质数
         */
        //法1
        Test test = new Test();
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            Map<Boolean, List<Integer>> booleanListMap = test.partitionPrimesWithCustomCollector(20);
            System.out.println(booleanListMap);
            long duration =System.currentTimeMillis()-start;
            System.out.println(duration);
        }

   /*
        把数字分为质数和非质数
         */
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










        /*
        6.4 分区
         */
       /* Map<Boolean, List<Dish>> collect = menu.stream().collect(partitioningBy(Dish::isVegetarian));
        List<Dish> dishes = collect.get(false);
        List<Dish> collect1 = menu.stream().filter(Dish::isVegetarian).collect(toList());

        Map<Boolean, Map<Dish.Type, List<Dish>>> collect2 = menu.stream().collect(partitioningBy(Dish::isVegetarian, groupingBy(Dish::getType)));
        System.out.println(collect2);
        Map<Boolean, Dish> collect3 = menu.stream().collect(partitioningBy((Dish::isVegetarian), collectingAndThen(maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get)));
        System.out.println(collect3);

        Map<Boolean, Map<Boolean, List<Dish>>> collect4 = menu.stream().collect(partitioningBy(Dish::isVegetarian, partitioningBy(d ->
            d.getCalories() > 500
        )));
        System.out.println(collect4);
        Map<Boolean, Long> collect5 = menu.stream().collect(partitioningBy(Dish::isVegetarian, counting()));
        System.out.println(collect5);*/





        /*
        6.3 分组
         */
      /*  Map<Dish.Type, List<Dish>> collect = menu.stream().collect(groupingBy(Dish::getType));
        System.out.println(collect.get(Dish.Type.FISH));

        Map<String, List<Dish>> collect1 = menu.stream().collect(groupingBy(dish -> {
            if (dish.getCalories() <= 400) return "低";
            else if (dish.getCalories() <= 700) return "中";
            else return "高";
        }));
        System.out.println(collect1);

        Map<Dish.Type, Map<String, List<Dish>>> collect2 = menu.stream().collect(groupingBy(Dish::getType, groupingBy(dish -> {
            if (dish.getCalories() <= 400) return "低";
            else if (dish.getCalories() <= 700) return "中";
            else return "高";
        })));
        System.out.println(collect2);
        Map<Dish.Type, Long> collect3 = menu.stream().collect(groupingBy(Dish::getType, counting()));
        System.out.println(collect3);
        Map<Dish.Type, Dish> collect4 = menu.stream()
                .collect(
                        groupingBy(Dish::getType,
                                collectingAndThen(maxBy(Comparator.comparingInt(Dish::getCalories)),
                                        Optional::get))
                );
        System.out.println(collect4.get(Dish.Type.FISH));


        Map<Dish.Type, IntSummaryStatistics> collect5 = menu.stream().collect(groupingBy(Dish::getType, summarizingInt(Dish::getCalories)));

        Map<Dish.Type, Set<String>> collect6 = menu.stream().collect(groupingBy(Dish::getType, mapping(dish -> {
            if (dish.getCalories() <= 400) return "低";
            else if (dish.getCalories() <= 700) return "中";
            else return "高";
        }, toSet())));

        Map<Dish.Type, Set<String>> collect7 = menu.stream().collect(groupingBy(Dish::getType, mapping(dish -> {
            if (dish.getCalories() <= 400) return "低";
            else if (dish.getCalories() <= 700) return "中";
            else return "高";
        }, toCollection(HashSet::new))));
        System.out.println(collect6);
        System.out.println(collect7);*/



         /*
        6.24广义的归约汇总
         */
   /*     Integer collect = menu.stream().collect(reducing(0, Dish::getCalories, Integer::sum));
        System.out.println(collect);
        int totalCalories = menu.stream().map(Dish::getCalories).reduce(Integer::sum).get();
        int totalCalories2 = menu.stream().mapToInt(Dish::getCalories).sum();
        String shortMenu = menu.stream().map(Dish::getName)
                .collect(reducing((s1, s2) -> s1 + s2)).get();*/


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

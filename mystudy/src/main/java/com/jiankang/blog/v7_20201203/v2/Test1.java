package com.jiankang.blog.v7_20201203.v2;

/*
 *@create by jiankang
 *@date 2020/12/3 @time 19:06
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));

        final Optional<Integer> reduce = personList.stream().map(Person::getSalary).reduce(Integer::sum);
        System.out.println(reduce.get());

        //reduce方法使用：
        System.out.println(personList.stream().reduce(0, (sum, p) -> sum += p.getSalary(), (sum1, sum2) -> sum1 + sum2));
        System.out.println(personList.stream().reduce(0, (sum, p) -> sum += p.getSalary(), Integer::sum));
        System.out.println(personList.stream().reduce(0, (max, p) -> max > p.getSalary() ? max : p.getSalary(), Integer::max));
        System.out.println(personList.stream().reduce(0, (max, p) -> max > p.getSalary() ? max : p.getSalary(), (a, b) -> a > b ? a : b));


        Map<Boolean, List<Person>> a = personList.stream().collect(Collectors.partitioningBy(x -> x.getSalary() > 8000));
        System.out.println(a);
         List<Person> personList1 = personList;
         List<Person> personList2 =personList;
         Stream<Person> distinct = Stream.concat(personList1.stream(), personList2.stream()).distinct();
        System.out.println(distinct.count());
    }
}

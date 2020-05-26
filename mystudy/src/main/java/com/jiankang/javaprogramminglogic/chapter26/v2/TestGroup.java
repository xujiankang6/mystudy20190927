package com.jiankang.javaprogramminglogic.chapter26.v2;

/*
 *@create by jiankang
 *@date 2020/5/24 time 17:29
 */

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class TestGroup {
    public static void main(String[] args) {
        Student student = new Student("a", 11, "one");
        Student student1 = new Student("b", 11, "two");
        Student student2 = new Student("c", 191, "one");
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);


        Map<String, Long> collect = students.stream().collect(groupingBy(Student::getGrade, counting()));
        collect.forEach((a, b) -> System.out.println(a + ": " + b));

        LinkedHashMap<String, Long> collect1 = Stream.of("hello", "world", "abc", "hello")
                .collect(groupingBy(Function.identity(), LinkedHashMap::new, counting()));
        collect1.forEach((a, b) -> System.out.println(a + ": " + b));

        Map<String, Optional<Student>> collect2 = students.stream().collect(groupingBy(Student::getGrade,
                maxBy(Comparator.comparing(Student::getScore))));
        collect2.forEach((a, b) -> System.out.println(a + ": " + b.toString()));

        Map<String, Student> collect3 = students.stream().collect(groupingBy(Student::getGrade,
                collectingAndThen(maxBy(Comparator.comparing(Student::getScore)), Optional::get)));
        collect3.forEach((a, b) -> System.out.println(a + ": " + b.toString()));

        Map<String, DoubleSummaryStatistics> collect4 = students.stream()
                .collect(groupingBy(Student::getGrade, summarizingDouble(Student::getScore)));
        collect4.forEach((a, b) -> System.out.println(a + ": " + b.getAverage()));

        //分组内的map
        Map<String, List<String>> collect5 = students.stream().
                collect(groupingBy(Student::getGrade, mapping(Student::getName, toList())));
        collect5.forEach((a, b) -> System.out.println(a + ": " + Arrays.toString(b.toArray())));


        Map<String, List<Student>> collect6 = students.stream().
                collect(groupingBy(Student::getGrade, collectingAndSort(toList(), Comparator.comparing(Student::getScore).reversed())));
        collect6.forEach((a, b) -> System.out.println(a + ": " + Arrays.toString(b.toArray())));

        Map<String, List<Student>> gradeStudentMap = students.stream()
                .filter(t -> t.getScore() < 60).collect(groupingBy(Student::getGrade, toList()));

        students.stream().collect(groupingBy(Student::getGrade, collectorAndFilter(toList(), t -> t.getScore() < 60)));


        students.stream().sorted(Comparator.comparing(Student::getScore).reversed())
                .collect(groupingBy(Student::getGrade,collectiongAndSkipLimit(toList(),0,2)));


        Map<Boolean, List<Student>> collect7 = students.stream().collect(partitioningBy(t -> t.getScore() >= 60));

        Map<Boolean, Double> collect8 = students.stream()
                .collect(partitioningBy(t -> t.getScore() >= 60, averagingDouble(Student::getScore)));

        Map<String, Map<Boolean, List<Student>>> collect9 = students.stream()
                .collect(groupingBy(Student::getGrade, partitioningBy(t -> t.getScore() >= 60)));


    }


    public static <T> Collector<T, ?, List<T>> collectiongAndSkipLimit(Collector<T, ?, List<T>> downstream, long skip, long limit) {
        return Collectors.collectingAndThen(downstream, (r) -> {
            return r.stream().skip(skip).limit(limit).collect(Collectors.toList());
        });
    }


    public static <T> Collector<T, ?, List<T>> collectorAndFilter(Collector<T, ?, List<T>> downstream, Predicate<T> predicate) {

        return Collectors.collectingAndThen(downstream, (r) -> {
            return r.stream().filter(predicate).collect(Collectors.toList());
        });
    }


    public static <T> Collector<T, ?, List<T>> collectingAndSort(
            Collector<T, ?, List<T>> downstream, Comparator<? super T> comparator) {

        return Collectors.collectingAndThen(downstream, (r) -> {
            r.sort(comparator);
            return r;
        });
    }


}

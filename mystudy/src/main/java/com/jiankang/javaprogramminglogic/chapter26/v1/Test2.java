package com.jiankang.javaprogramminglogic.chapter26.v1;

/*
 *@create by jiankang
 *@date 2020/5/24 time 15:47
 */

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("zhangsan", 789), new Student("xiao", 11));
        List<String> collect = students.stream().filter(t -> t.getScore() > 90).peek(System.out::println).map(Student::getName).collect(Collectors.toList());
        List<String> list = Arrays.asList(new String[]{"hello abc", "laoma jiankang"});
        List<String> collect1 = list.stream().flatMap(line -> Arrays.stream(line.split("\\s+"))).collect(Collectors.toList());
        System.out.println(collect1);

        Student[] array = students.stream().filter(t -> t.getScore() > 90).toArray(Student[]::new);
        System.out.println(array);
        File[] files = new File("..").listFiles();
        Arrays.stream(files).filter(File::isFile).map(File::getName).forEach(System.out::println);
        Map<String, Double> collect2 = students.stream().collect(Collectors.toMap(Student::getName, Student::getScore));
        students.stream().collect(Collectors.toMap(Student::getName, Function.identity()));
        students.stream().collect(Collectors.toMap(Student::getName, t -> t));
        Stream.of("abc","hello","abc").collect(Collectors.toMap(Function.identity(),t->t.length(),(oldValue,value)->value));

        BinaryOperator<String> mergeFunction = (old,value)->old+","+value;
        Map<String, String> collect3 = Stream.of("abc", "hello", "abc").collect(Collectors.toMap(Function.identity(), t -> t, mergeFunction));
        collect3.forEach((key,value)-> System.out.println(key+">"+value));
        String collect4 = Stream.of("abc", "hello", "abc").collect(Collectors.joining(", ", "[", "]"));
        System.out.println(collect4);
    }
}

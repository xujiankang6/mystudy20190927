package com.jiankang.javaprogramminglogic.chapter26.v1;

/*
 *@create by jiankang
 *@date 2020/5/24 time 13:51
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("zhangsan", 789), new Student("xiao", 11));
        List<Student> filter1 = filter(students, t -> t.getScore() > 90);
        System.out.println(Arrays.toString(new List[]{filter1}));
        List<String> map = map(students, t -> t.getName());
        List<Student> map1 = map(students, t -> new Student(t.getName().toUpperCase(), t.getScore()));
        System.out.println(Arrays.toString(new List[]{map}));
        System.out.println(Arrays.toString(new List[]{map1}));
        foreach(students, t -> t.setName(t.getName().toUpperCase()));
        System.out.println(Arrays.toString(new List[]{students}));
        List<String> map2 = map(students, Student::getName);
        System.out.println(Arrays.toString(new List[]{map2}));
        Supplier<String> s = Student::getCollegeName;
        Supplier<String> s2 = () -> Student.getCollegeName();
        System.out.println(s + ":" + s2);
        List<Student> collect = students.stream().filter(t -> t.getScore() > 90).sorted(Comparator.comparing(Student::getScore).reversed().thenComparing(Student::getName))
                .collect(Collectors.toList());

        System.out.println(collect.toString() );


    }


    public static <E> void foreach(List<E> list, Consumer<E> consumer) {
        for (E e : list) {
            consumer.accept(e);
        }
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
        ArrayList<R> retList = new ArrayList<>(list.size());
        for (T o : list) {
            retList.add(mapper.apply(o));
        }
        return retList;
    }


    public static <E> List<E> filter(List<E> list, Predicate<E> pred) {
        ArrayList<E> retList = new ArrayList<>();
        for (E e : list) {
            if (pred.test(e)) {
                retList.add(e);
            }
        }
        return retList;
    }
}

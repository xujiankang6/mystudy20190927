package com.jiankang.javaprogramminglogic.chapter21.v2;

/*
 *@create by jiankang
 *@date 2020/5/18 time 16:10
 */

import com.jiankang.javaprogramminglogic.chapter13.v1.Student;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class SimpleMapperDemo {
    public static void main(String[] args) {
        Student student = new Student("张三", 18, 89d);
        String string = SimpleMapper.toString(student);
        Class<? extends Student> aClass = student.getClass();
        TypeVariable<? extends Class<? extends Student>>[] typeParameters = aClass.getTypeParameters();
        System.out.println(Arrays.toString(typeParameters));
        System.out.println(string);
        Student student1 = (Student) SimpleMapper.fromString(string);
        System.out.println(student1);
    }
}

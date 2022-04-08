package com.jiankang.javabianchengsixiang4.chapter2.v1;

/**
 * Teacher
 *
 * @author jiankang.xu
 * @date 2022/4/4
 */
public class Teacher {
    String name;
    int age;
    char sex;
    float score;

    public Teacher(String name, int age, char sex, float score) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
    }

    public static void main(String[] args) {
        new Teacher("a",1,'男',1.11f);
    }
}

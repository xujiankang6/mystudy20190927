package com.jiankang.javaprogramminglogic.chapter22.v3;

/*
 *@create by jiankang
 *@date 2020/5/19 time 14:59
 */

import java.util.Date;

public class Student {
    @Label("姓名")
    String name;

    @Label("出生日期")
    @Format(pattern = "yyyy/MM/dd")
    Date born;

    @Label("分数")
    double score;

    public Student(String name, Date born, double score) {
        this.name = name;
        this.born = born;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", born=" + born +
                ", score=" + score +
                '}';
    }
}

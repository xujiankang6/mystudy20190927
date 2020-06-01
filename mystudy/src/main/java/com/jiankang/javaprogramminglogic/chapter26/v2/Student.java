package com.jiankang.javaprogramminglogic.chapter26.v2;

/*
 *@create by jiankang
 *@date 2020/5/24 time 13:51
 */

public class Student {
    String name;
    double score;
    String grade;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", grade='" + grade + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student(String name, double score, String grade) {
        this.name = name;
        this.score = score;
        this.grade = grade;
    }
}

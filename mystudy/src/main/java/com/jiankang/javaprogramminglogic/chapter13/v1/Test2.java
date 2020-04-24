package com.jiankang.javaprogramminglogic.chapter13.v1;

/*
 *@create by jiankang
 *@date 2020/3/28 time 20:05
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) throws IOException {
        List<Student> students = Arrays.asList(new Student[]{
                new Student("a", 1, 80.1d), new Student("b", 2, 80.12)
        });
        printWriteStudents(students);
        List<Student> students1 = readStudents();
        students1.forEach(student -> {
            System.out.println(student.toString());
        });


    }

    //文件读取
    public static List<Student> readStudents() throws IOException {
        BufferedReader reader = null;
        List<Student> students = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader("students.txt"));

            String line = reader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                Student student = new Student();
                student.name = fields[0];
                student.age = Integer.parseInt(fields[1]);
                student.score = Double.parseDouble(fields[2]);
                students.add(student);
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return students;
    }

    //使用BufferedWriter保存文本
    public static void printWriteStudents(List<Student> students) throws IOException {
        PrintWriter writer = new PrintWriter("students.txt");
        try {
            for (Student student : students) {
                writer.println(student.name + "," + student.age + "," + student.score);
            }
        } finally {
            writer.close();
        }
    }


    //使用BufferedWriter保存文本
    public static void writeStudents(List<Student> students) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("students.txt"));
            for (Student student : students) {
                writer.write(student.name + "," + student.age + "," + student.score);
                writer.newLine();
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}

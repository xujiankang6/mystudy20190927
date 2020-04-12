package com.jiankang.javaprogramminglogic.chapter14.v2;

/*
 *@create by jiankang
 *@date 2020/3/30 time 17:13
 */


import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception {
        List<Student> students = Arrays.asList(new Student[]{
                new Student("a", 1, 80.1d), new Student("b", 2, 80.12)
        });
        writeStudents(students);
        List<Student> students1 = readStudents();
        students1.forEach(student -> {
            System.out.println(student.toString());
        });
    }

    public static List<Student> readStudents() throws Exception {
        ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream("student.txt")));
        try {
            List<Student> students = (List<Student>) input.readObject();
            return students;
        } finally {
            input.close();
        }
    }


    public static void writeStudents(List<Student> students) throws Exception {
        ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("student.txt")));
        try {
            output.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            output.close();
        }
    }
}

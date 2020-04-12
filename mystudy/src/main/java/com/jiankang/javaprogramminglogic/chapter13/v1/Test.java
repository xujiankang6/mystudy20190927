package com.jiankang.javaprogramminglogic.chapter13.v1;

/*
 *@create by jiankang
 *@date 2020/3/28 time 17:56
 */

import java.io.*;
import java.util.ArrayList;
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
        DataInputStream input = new DataInputStream(new FileInputStream("student.txt"));
        try {
            int size = input.readInt();
            ArrayList<Student> students = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Student student = new Student();
                student.setName(input.readUTF());
                student.setAge(input.readInt());
                student.setScore(input.readDouble());
                students.add(student);
            }
            return students;
        } finally {
            input.close();
        }
    }


    public static void writeStudents(List<Student> students) throws Exception {
        DataOutputStream output = new DataOutputStream(new FileOutputStream("student.txt"));
        try {
            output.writeInt(students.size());
            for (int i = 0; i < students.size(); i++) {
                output.writeUTF(students.get(i).getName());
                output.writeInt(students.get(i).getAge());
                output.writeDouble(students.get(i).getScore());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            output.close();
        }
    }
}

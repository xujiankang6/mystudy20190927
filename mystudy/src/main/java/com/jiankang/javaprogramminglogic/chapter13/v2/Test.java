package com.jiankang.javaprogramminglogic.chapter13.v2;

/*
 *@create by jiankang
 *@date 2020/3/29 time 12:28
 */

import com.jiankang.javaprogramminglogic.chapter13.v1.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {

        readStudents();
    }


    //文件读取
    public static List<Student> readStudents() throws IOException {
        BufferedReader reader = null;
        List<Student> students = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader("students.txt"));

            String line = reader.readLine();
            while (line != null) {
                Student student = new Student();
                Scanner scanner = new Scanner(line).useDelimiter(",");
                student.setName(scanner.next());
                student.setAge(scanner.nextInt());
                student.setScore(scanner.nextDouble());
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
}

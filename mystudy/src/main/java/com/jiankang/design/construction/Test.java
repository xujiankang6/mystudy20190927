package com.jiankang.design.construction;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder=new CourseActucalBuilder();
        Coach coach=new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course=coach.makeCourse("name","ppt","video","article","qa");
    }
}

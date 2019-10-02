package com.jiankang.design.construction;

public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder=new CourseActucalBuilder();
        Coach coach=new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course=coach.makeCourse("name","ppt","video","article","qa");
        System.out.println(course);;
    }
}

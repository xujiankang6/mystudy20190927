package com.jiankang.design.construction.v2;


import java.util.Set;

public class Test
{
    public static void main(String[] args) {
        Course course= new Course.CourseBuilder().setCourseName("name").setcourseArticle("artilce").setcoursePPT("ppt").setcourseQA("qa")
                .setcourseVideo("video").Build();
        System.out.println(course);


    }
}

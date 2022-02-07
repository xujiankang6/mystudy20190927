package com.jiankang.design.construction;

public interface CourseBuilder {


    public abstract void buildCourseName(String courseName);

    public abstract void buildcoursePPT(String coursePPT);

    public abstract void buildcourseVideo(String courseVideo);

    public abstract void buildcourseArticle(String courseArticle);

    public abstract void buildcourseQA(String courseQA);


    public abstract Course makeCourse();
}

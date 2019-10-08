package com.jiankang.design.construction;

public class Coach {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }


    public Course makeCourse(String courseName,
                             String coursePPT,
                             String courseVideo,
                             String courseArticle,
                             String courseQA) {

        this.courseBuilder.buildcourseArticle(courseArticle);
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildcoursePPT(coursePPT);
        this.courseBuilder.buildcourseQA(courseQA);
        this.courseBuilder.buildcourseVideo(courseVideo);
        return this.courseBuilder.makeCourse();
    }
}

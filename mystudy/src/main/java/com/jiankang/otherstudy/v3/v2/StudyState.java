package com.jiankang.otherstudy.v3.v2;

/**
 * StudyState
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */
public class StudyState extends State {

    public StudyState() {
        nextState = new GraduateState();
    }

    @Override
    void action() {
        System.out.println(String.format("学生%s学习中....", context.getStudent().getName()));
    }
}

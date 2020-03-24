package com.jiankang.otherstudy.v3.v2;

/**
 * GraduateState
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */
public class GraduateState extends State {

    public GraduateState() {
        nextState = null;
    }

    @Override
    void action() {
        System.out.println(String.format("学生%s毕业中....", context.getStudent().getName()));
    }
}

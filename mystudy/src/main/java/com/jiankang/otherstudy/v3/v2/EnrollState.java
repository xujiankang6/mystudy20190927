package com.jiankang.otherstudy.v3.v2;

/**
 * EnrollState
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */
public class EnrollState extends State {

    public EnrollState() {
        super();
        nextState=new StudyState();
    }

    @Override
    void action() {
        System.out.println(String.format("学生%s报道中....", context.getStudent().getName()));
    }
}

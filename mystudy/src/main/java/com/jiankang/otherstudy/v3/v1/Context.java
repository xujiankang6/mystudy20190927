package com.jiankang.otherstudy.v3.v1;

/**
 * Context
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */
public class Context {
    public void Action(Integer state,Student student) throws Exception {
        if(state==null){
            throw new Exception("state 不能为空");
        }

        switch (state){
            case 0:
                enroll(student);
                break;
            case 1:
                study(student);
                break;
            case 2:
                graduate(student);
                break;
            default:
        }
    }

    private void graduate(Student student) {
        System.out.println(String.format("学生%s毕业中....", student.getName()));
    }

    private void study(Student student) {
        System.out.println(String.format("学生%s学习中....", student.getName()));
    }

    private void enroll(Student student) {
        System.out.println(String.format("学生%s报道中....", student.getName()));
    }
}

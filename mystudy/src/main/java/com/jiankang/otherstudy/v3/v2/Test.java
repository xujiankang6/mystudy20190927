package com.jiankang.otherstudy.v3.v2;

/**
 * LogTest
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("aaa");
        Context context = new Context();
        context.setStudent(student);
        context.setCurrentState(new EnrollState());

        context.doAction();
        State nextSate = context.getNextSate();
        while (nextSate!=null){
            context.setCurrentState(nextSate);
            context.doAction();
            nextSate = context.getNextSate();
        }
    }
}


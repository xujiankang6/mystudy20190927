package com.jiankang.otherstudy.v3.v1;

/**
 * Test
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.setName("aa");
        Context context = new Context();
        context.Action(Integer.valueOf(0),student);
    }
}

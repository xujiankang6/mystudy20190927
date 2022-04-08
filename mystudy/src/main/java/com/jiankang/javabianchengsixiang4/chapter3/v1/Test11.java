package com.jiankang.javabianchengsixiang4.chapter3.v1;

/**
 * Test9
 *
 * @author jiankang.xu
 * @date 2022/4/8
 */
public class Test11 {
    public static void main(String[] args) {
        int month = 2;
        String value;
        if (month == 1 )
            value = "A";
        else if (month == 2)
            value = "B";
        else if (month == 3)
            value = "C";
        else
            value = "Error";

        System.out.println("value = " + value);
    }
}

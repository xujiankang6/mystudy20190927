package com.jiankang.otherstudy.v1;

/**
 * switch语句要先判断是否为空，否则会报空指针异常
 */
public class TestUrlUtil {
    public static void main(String[] args) {
        String select = null;
        switch (select){
            case "null":
                System.out.println("null");
                break;
            case "a":
                System.out.println("a");
                break;
            default:
                System.out.println("nn");
        }
    }

}

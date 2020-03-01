package com.jiankang.otherstudy.v1;

public class SwitchNullTest {
    public static void main(String[] args) {
        String select = null;
        switch (select="null"){
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

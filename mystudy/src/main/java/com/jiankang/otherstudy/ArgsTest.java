package com.jiankang.otherstudy;

/**
 * ArgsTest
 *可变参数学习
 *  * @author jiankang.xu
 * @date 2020/3/13
 */
public class ArgsTest {

    public static void main(String[] args) {
        String address = "localhost:8080/rest?token=%s&id=%s";
        String format = String.format(address, "aa", "bb");
        System.out.println(format);
    }
}

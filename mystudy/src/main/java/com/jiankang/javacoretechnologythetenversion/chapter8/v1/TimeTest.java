package com.jiankang.javacoretechnologythetenversion.chapter8.v1;

/*
 *@create by jiankang
 *@date 2020/6/17 time 14:15
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TimeTest {
    public static void main(String[] args) {
        ArrayList<Bean> beans = new ArrayList<>();
        beans.add(new Bean("1", "a"));
        beans.add(new Bean("2", ""));
        beans.add(new Bean("3", null));
        beans.add(new Bean("4", "a"));
        List<Bean> collect = beans.stream().filter(it -> it.a != null && it.b != null && !"".equals(it.b) && it.a != "1").collect(Collectors.toList());
        collect.stream().forEach(it -> {
                    System.out.println(it.toString());
                }
        );
    }


    static class Bean {
        private String a;
        private String b;

        public Bean(String a, String b) {
            this.a = a;
            this.b = b;
        }

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }

        public String getB() {
            return b;
        }

        public void setB(String b) {
            this.b = b;
        }

        @Override
        public String toString() {
            return "Bean{" +
                    "a='" + a + '\'' +
                    ", b='" + b + '\'' +
                    '}';
        }
    }
}

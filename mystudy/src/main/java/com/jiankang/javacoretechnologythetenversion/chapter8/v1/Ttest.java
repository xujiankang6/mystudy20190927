package com.jiankang.javacoretechnologythetenversion.chapter8.v1;

/*
 *@create by jiankang
 *@date 2020/6/16 time 11:37
 */

import java.time.LocalDate;

public class Ttest {
    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.of(1111,12,1),
                LocalDate.of(1211,12,1),
                LocalDate.of(1311,12,1),
                LocalDate.of(1411,12,1)
        };
        Pair<LocalDate> localDatePair = ArrayAlg.minmaxT(birthdays);
        System.out.println("min: "+localDatePair.getFirst());
        System.out.println("max: "+localDatePair.getSecond());

        System.out.println((int)Math.floor((1592364464782L - 1592299284000L) / 86400000));
    }
}

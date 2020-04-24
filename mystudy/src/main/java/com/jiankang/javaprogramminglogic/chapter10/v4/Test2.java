package com.jiankang.javaprogramminglogic.chapter10.v4;

/*
 *@create by jiankang
 *@date 2020/4/9 time 12:38
 */

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        DataRecord dataRecord = new DataRecord("1", "", null, "1");
        DataRecord dataRecord2 = new DataRecord("1", "1", null, "1");
        DataRecord dataRecord3 = new DataRecord("1", "1.11", null, "1");
        DataRecord dataRecord4 = new DataRecord("1", "1", null, "1");
        List<DataRecord> s = new ArrayList<>();
        s.add(dataRecord);
        s.add(dataRecord2);
        s.add(dataRecord3);
        s.add(dataRecord4);
        double sum = s.stream().mapToDouble(it -> {
            Double aDouble = Double.valueOf((it.n1 == null || it.n1.equals("")) ? "0" : it.n1);
            Double bDouble = Double.valueOf((it.n2 == null || it.n2.equals("")) ? "0" : it.n2);
            Double cDouble = Double.valueOf((it.n3 == null || it.n3.equals("")) ? "0" : it.n3);
            Double dDouble = Double.valueOf((it.n4 == null || it.n4.equals("")) ? "0" : it.n4);
            return aDouble + bDouble + cDouble + dDouble;
        }).sum();
        System.out.println(sum);

    }
}

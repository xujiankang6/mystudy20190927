package com.jiankang.javacoretechnologythetenversion.dchapter10.v2;

/*
 *@create by jiankang
 *@date 2020/7/24 time 16:02
 */

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DataUtils {

    public static String[] taxs = new String[]{"稿酬所得", "劳务报酬所得", "特许权使用费所得"};
    public static String[] documentPropertys = new String[]{"A公司", "B公司"};
    public static int[] lectures = new int[]{100, 101, 102, 103};


    public static List<DataRecord> getDatas() {
        List<DataRecord> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new DataRecord(i, taxs[i % 3], documentPropertys[i % 2], new BigDecimal(i), lectures[i % 4]));
        }
        return list;
    }

}

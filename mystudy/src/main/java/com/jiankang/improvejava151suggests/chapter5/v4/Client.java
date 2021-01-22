package com.jiankang.improvejava151suggests.chapter5.v4;

/*
 *@create by jiankang
 *@date 2020/11/10 @time 19:53
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/10   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */
public class Client {
    public static void main(String[] args) {
        int stuNum = 80 * 10000;
        List<Integer> scores = new LinkedList<Integer>();
        for (int i = 0; i < stuNum; i++) {
            scores.add(new Random().nextInt(150));
        }
        long start = System.currentTimeMillis();
        System.out.println("average is :" + average(scores));
        long end = System.currentTimeMillis();
        System.out.println("执行时间： " + (end - start) + " ms");
    }

    private static int average(List<Integer> scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / scores.size();
    }

    private static int average2(List<Integer> scores) {
        int sum = 0;
        for (int i = 0; i < scores.size(); i++) {
            sum += scores.get(i);
        }
        return sum / scores.size();
    }


    public static int averageGood(List<Integer> list) {
        int sum = 0;
        if (list instanceof RandomAccess) {
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
        } else {
            for (int i : list) {
                sum += i;
            }

        }
        return sum / list.size();
    }
}

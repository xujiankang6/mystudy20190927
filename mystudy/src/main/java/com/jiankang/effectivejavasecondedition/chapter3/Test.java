package com.jiankang.effectivejavasecondedition.chapter3;

/*
 *@create by jiankang
 *@date 2020/1/9 time 16:21
 */

import com.jiankang.effectivejavasecondedition.chapter3.v2.ColorPoint;
import com.jiankang.effectivejavasecondedition.chapter3.v2.Point;

import java.awt.*;
import java.sql.Timestamp;


public class Test {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        ColorPoint colorPoint = new ColorPoint(1, 2, Color.red);
        System.out.println(point.equals(colorPoint));
        System.out.println(colorPoint.equals(point));




    }
}

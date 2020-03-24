package com.jiankang.effectivejavasecondedition.chapter3.v4;

/*
 *@create by jiankang
 *@date 2020/1/9 time 16:50
 */

import com.jiankang.effectivejavasecondedition.chapter3.v2.ColorPoint;

import java.awt.*;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //use getClass
    @Override
    public boolean equals(Object obj) {

        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Point p = (Point) obj;
        return p.x == x && p.y == y;
    }

    public static void main(String[] args) {
        Point point = new Point(1, 2);
        ColorPoint colorPoint = new ColorPoint(1, 2, Color.red);
        System.out.println(point.equals(colorPoint));
        System.out.println(colorPoint.equals(point));
    }

}

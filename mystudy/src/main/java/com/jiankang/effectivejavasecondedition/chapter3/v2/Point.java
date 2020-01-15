package com.jiankang.effectivejavasecondedition.chapter3.v2;

/*
 *@create by jiankang
 *@date 2020/1/9 time 16:50
 */

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        Point p = (Point) obj;
        return p.x == x && p.y == y;
    }


}

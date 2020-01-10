package com.jiankang.effectivejavasecondedition.chapter3.v6;

/*
 *@create by jiankang
 *@date 2020/1/9 time 16:50
 */

import java.util.HashSet;
import java.util.Set;

public class Point {
    private int x;
    private int y;
    private static Set<Point> unitCircle;

    static {
        unitCircle = new HashSet<Point>();
        unitCircle.add(new Point(1, 0));
        unitCircle.add(new Point(0, 1));
        unitCircle.add(new Point(-1, 0));
        unitCircle.add(new Point(0, -1));
    }

    public static boolean onUnitCircle(Point p) {
        return unitCircle.contains(p);
    }

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

package com.jiankang.effectivejavasecondedition.chapter3.v6;

/*
 *@create by jiankang
 *@date 2020/1/9 time 17:06
 */


import java.awt.*;

public class ColorPoint {
    private Color color;
    private Point point;

    public ColorPoint(int x, int y, Color color) {
        if (color == null)
            throw new NullPointerException();
        point = new Point(x, y);
        this.color = color;
    }


    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ColorPoint))
            return false;
        ColorPoint cp = (ColorPoint) obj;
        return cp.point.equals(point) && cp.color.equals(color);
    }


}

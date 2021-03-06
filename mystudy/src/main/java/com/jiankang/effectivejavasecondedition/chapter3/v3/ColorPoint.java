package com.jiankang.effectivejavasecondedition.chapter3.v3;

/*
 *@create by jiankang
 *@date 2020/1/9 time 17:06
 */

import java.awt.*;

public class ColorPoint extends Point {
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point))
            return false;

        if (!(obj instanceof ColorPoint))
            return obj.equals(this);

        return super.equals(obj) && ((ColorPoint) obj).color == color;
    }


}

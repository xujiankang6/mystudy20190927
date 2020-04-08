package com.jiankang.javaprogramminglogic.chapter10.v2;

/*
 *@create by jiankang
 *@date 2020/4/8 time 16:25
 */

import java.util.Objects;

public class Spec {
    String size;
    String color;

    public Spec(String size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spec spec = (Spec) o;
        return Objects.equals(size, spec.size) &&
                Objects.equals(color, spec.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, color);
    }

    @Override
    public String toString() {
        return "Spec{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

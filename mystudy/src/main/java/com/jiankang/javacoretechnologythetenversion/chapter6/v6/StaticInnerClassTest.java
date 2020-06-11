package com.jiankang.javacoretechnologythetenversion.chapter6.v6;

/*
 *@create by jiankang
 *@date 2020/6/11 time 18:56
 */

public class StaticInnerClassTest {
    public static void main(String[] args) {
        double[] d =new double[20];
        for(int i=0;i<d.length;i++){
            d[i] = 100* Math.random();
        }
        ArrayAlg.Pair p = ArrayAlg.minmax(d);
        System.out.println("min: "+p.getFirst());
        System.out.println("max: "+p.getSecond());

        ArrayAlg.Pair p1 =new ArrayAlg.Pair(1,2);
        System.out.println(p1.getSecond());
    }
}

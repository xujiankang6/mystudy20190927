package com.jiankang.javacoretechnologythetenversion.dchapter10.v4;

/*
 *@create by jiankang
 *@date 2020/7/27 time 19:55
 */

public class InheritableSon extends  InheritableFather{

    public InheritableSon() {
        super();
        System.out.println("InheritableSon : "+ InheritableSon.class.isAnnotationPresent(Inheritable.class));
    }

    public static void main(String[] args) {
        final InheritableSon inheritableSon = new InheritableSon();

    }
}

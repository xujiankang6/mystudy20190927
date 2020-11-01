package com.jiankang.javacoretechnologythetenversion.dchapter10.v4;

/*
 *@create by jiankang
 *@date 2020/7/27 time 19:55
 */
@Inheritable
public class InheritableFather {

    public InheritableFather(){
        System.out.println("InheritableFather : "+InheritableFather.class.isAnnotationPresent(Inheritable.class));
    }
}

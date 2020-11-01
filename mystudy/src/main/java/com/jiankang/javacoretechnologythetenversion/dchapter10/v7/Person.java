package com.jiankang.javacoretechnologythetenversion.dchapter10.v7;

/*
 *@create by jiankang
 *@date 2020/7/28 time 10:43
 */

import com.sun.istack.internal.NotNull;

public class Person {


    @Range(min=1,max=20)
    public String name;

    @Range(max = 10)
    public String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void hello(@NotNull @Range(max = 20) String name,@NotNull String city){

    }
}

package com.jiankang.javaprogramminglogic.chapter10.v8;

/*
 *@create by jiankang
 *@date 2020/4/15 time 10:39
 */

public class Apple {
    String name;
    String id;
    String rank;

    public Apple(String name, String id, String rank) {
        this.name = name;
        this.id = id;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}

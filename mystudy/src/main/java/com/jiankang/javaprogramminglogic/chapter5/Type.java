package com.jiankang.javaprogramminglogic.chapter5;

/*
 *@create by jiankang
 *@date 2020/4/12 time 16:29
 */

public enum Type {
    CSV("csv"), XLSX("xlsx"), XLS("xls");


    private String type;

    Type(String type) {

        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public static Type fromType(String type) {
        for (Type type1 : Type.values()) {
            if (type1.getType().equals(type))
                return type1;
        }
        return null;
    }
}

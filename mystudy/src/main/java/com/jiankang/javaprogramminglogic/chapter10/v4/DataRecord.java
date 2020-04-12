package com.jiankang.javaprogramminglogic.chapter10.v4;

/*
 *@create by jiankang
 *@date 2020/4/9 time 12:39
 */

public class DataRecord {

    String n1;
    String n2;
    String n3;
    String n4;

    public DataRecord(String n1, String n2, String n3, String n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public String getN3() {
        return n3;
    }

    public void setN3(String n3) {
        this.n3 = n3;
    }

    public String getN4() {
        return n4;
    }

    public void setN4(String n4) {
        this.n4 = n4;
    }

    @Override
    public String toString() {
        return "DataRecord{" +
                "n1='" + n1 + '\'' +
                ", n2='" + n2 + '\'' +
                ", n3='" + n3 + '\'' +
                ", n4='" + n4 + '\'' +
                '}';
    }
}

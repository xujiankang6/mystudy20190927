package com.jiankang.javaapi.v1_enumstudy;

/*
 *@create by jiankang
 *@date 2020/1/14 time 16:51
 */

enum Operation {
    PLUS {
        double eval(double x, double y) {
            return x + y;
        }
    },
    MINUS {
        double eval(double x, double y) {
            return x - y;
        }
    },
    TIMES {
        double eval(double x, double y) {
            return x * y;
        }
    },
    DIVIDED_BY {
        double eval(double x, double y) {
            return x / y;
        }
    };

    abstract double eval(double x, double y);

    public static void main(String[] args) {
        double x = 12;
        double y = 6.0;
        for (Operation op : Operation.values()) {
            System.out.println(x + " " + op + " " + y + " = " + op.eval(x, y));
        }
    }
}

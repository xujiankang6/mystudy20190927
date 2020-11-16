package com.jiankang.improvejava151suggests.chapter2.v4;

/*
 *@create by jiankang
 *@date 2020/11/13 @time 17:00
 */

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/13   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class Calculator {
    private int i, j, result;

    public Calculator(int i, int j) {
        this.i = i;
        this.j = j;

    }

    protected void setOperator(Ops ops) {
        result = ops.equals(Ops.ADD) ? i + j : i - j;
    }

    public int getResult() {
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(1, 2) {
            {
                setOperator(Ops.ADD);
                System.out.println(getResult());
            }
        };
    }

    //匿名类等价于下面子类
    class Add extends Calculator {
        {
            setOperator(Ops.ADD);
        }

        public Add(int i, int j) {
            super(i, j);
        }
    }
}

enum Ops {ADD, SUB}
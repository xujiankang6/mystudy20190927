package com.jiankang.improvejava151suggests.chapter5.v2;

/*
 *@create by jiankang
 *@date 2020/11/10 @time 17:51
 */

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/10   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */
public class Test {

    public static void main(String[] args) {
        switch (Color.Blue) {
            case Red:
                System.out.println(1);
                break;
            case Blue:
            case Indigo:
                System.out.println(2);
                break;
            case Green:
                System.out.println(3);
                break;
            default:
                System.out.println(4);

        }

    }

    enum Color {
        Red, Orange, Yellow, Green, Indigo, Blue, Violet;
    }
}

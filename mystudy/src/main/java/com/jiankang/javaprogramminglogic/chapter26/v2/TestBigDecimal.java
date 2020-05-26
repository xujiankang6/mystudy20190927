package com.jiankang.javaprogramminglogic.chapter26.v2;

/*
 *@create by jiankang
 *@date 2020/5/25 time 18:15
 */

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class TestBigDecimal {
    public static void main(String[] args) {
        String a = "1.111";
        String b = "1.111";
        BigDecimal s = formatMoney(a);
        System.out.println(s);
        BigDecimal s1 = formatMoney(b);
        BigDecimal bigDecimal = moneyAdd(s,s1 );
        double v = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(v);

    }

    /**
     * 格式化金额
     * @param value
     * @return
     */
    public static BigDecimal formatMoney(String value) {
        DecimalFormat fnum = new DecimalFormat("##0.00000000000000000000");
        if (value == null || value == "") {
            value = "0.00";
        }
        return new BigDecimal(fnum.format(new BigDecimal(value)));
    }


    /**
     * 金额相加
     *
     */
    public static BigDecimal moneyAdd(BigDecimal value, BigDecimal augend) {
        return value.add(augend);
    }
}

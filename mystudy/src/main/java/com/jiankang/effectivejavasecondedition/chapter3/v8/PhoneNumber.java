package com.jiankang.effectivejavasecondedition.chapter3.v8;

/*
 *@create by jiankang
 *@date 2020/1/10 time 14:30
 */

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber {

    private short areaCode;
    private short prefix;
    private short lineNumber;
    private int hashCode;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }


    @Override
    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhoneNumber)) {
            return false;
        }
        PhoneNumber pn = (PhoneNumber) obj;
        return pn.lineNumber == this.lineNumber && pn.prefix == this.prefix && pn.areaCode == this.areaCode;
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = 17;
            result = 31 * result + this.areaCode;
            result = 31 * result + prefix;
            result = 31 * result + lineNumber;
        }
        return result;
    }

    public static void main(String[] args) {
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(22, 22, 22), "aaa");
        String s = m.get(new PhoneNumber(22, 22, 22));
        System.out.println(s);
        int i = s.hashCode();
        System.out.println(i);

    }
}

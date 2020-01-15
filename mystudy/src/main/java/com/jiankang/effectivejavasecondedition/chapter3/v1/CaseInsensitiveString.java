package com.jiankang.effectivejavasecondedition.chapter3.v1;

/*
 *@create by jiankang
 *@date 2020/1/9 time 16:22
 */

import java.util.ArrayList;
import java.util.List;

public final class CaseInsensitiveString {
    private String s;


    public CaseInsensitiveString(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CaseInsensitiveString && ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
    }

    public static void main(String[] args) {
        CaseInsensitiveString string = new CaseInsensitiveString("aa");
        System.out.println(string.equals("Aa"));
        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(string);
        System.out.println(list.contains("Aa"));
    }
}

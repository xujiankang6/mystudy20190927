package com.jiankang.javacoretechnologythetenversion.chapter9.v5;

/*
 *@create by jiankang
 *@date 2020/6/21 time 19:09
 */

import com.jiankang.javacoretechnologythetenversion.chapter4.v2.Employee;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {

        //按照插入顺序访问
        System.out.println("按照插入顺序访问");
        Map<String, Employee> staff = new LinkedHashMap<>();
        staff.put("1", new Employee("aaa"));
        staff.put("2", new Employee("bbb"));
        staff.put("3", new Employee("ccc"));
        staff.put("4", new Employee("ddd"));
        staff.get("1");
        Set<String> strings = staff.keySet();
        strings.forEach(e-> System.out.println(e));

//        Iterator<Employee> values = staff.values().iterator();
//        values.forEachRemaining(e-> System.out.println(e.getName()));

        //按照访问顺序访问
        System.out.println("按照访问顺序访问");
        Map<String, Employee> staff1 = new LinkedHashMap<String, Employee>(16, (float) 0.75,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Employee> eldest) {
                return size()>3;
            }
        };
        staff1.put("1", new Employee("aaa"));
        staff1.put("2", new Employee("bbb"));
        staff1.put("3", new Employee("ccc"));
        staff1.put("4", new Employee("ddd"));
        staff1.get("1");
        Set<String> string2 = staff1.keySet();
        string2.forEach(e-> System.out.println(e));

    }
}

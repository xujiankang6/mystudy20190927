package com.jiankang.javacoretechnologythetenversion.dchapter11.v2;

/*
 *@create by jiankang
 *@date 2020/7/28 time 20:04
 */

import java.rmi.Naming;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        try {
            PersionService persionService = (PersionService) Naming.lookup("rmi://127.0.0.1:6677/PersonService/");
            final List<Person> personList = persionService.getPersonList(5);
            for (Person person : personList) {
                System.out.println(person);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

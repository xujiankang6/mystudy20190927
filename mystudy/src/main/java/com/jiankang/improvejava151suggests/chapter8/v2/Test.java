package com.jiankang.improvejava151suggests.chapter8.v2;

/*
 *@create by jiankang
 *@date 2020/11/1 time 18:35
 */


public class Test {
    public static void main(String[] args) {
        System.out.println(doStuff().getName());

        try {
            doSomething();
        }catch (RuntimeException e){
            System.out.println("这里永远都不会到达！");
        }

    }

    public static void doSomething(){
        try {
            throw new RuntimeException();
        }finally {
            return;
        }
    }

    public static Person doStuff(){
        Person person = new Person();
        person.setName("张三");
        try{
            return person;
        }catch (Exception e){

        }finally {
            person.setName("李四");
        }
        person.setName("王五");
        return person;
    }
}

class  Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

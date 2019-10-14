package singletoninstance;

/*
 *@create by jiankang
 *@date 2019/9/30 time 11:04
 */

public class Singleton {
    private Singleton(){
        System.out.println("singleton is created");
    }
    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }

    public static void createString(){
        System.out.println("createString in Singleton");
    }






}

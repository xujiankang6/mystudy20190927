package singletoninstance;

/*
 *@create by jiankang
 *@date 2019/9/30 time 11:35
 */

import java.io.Serializable;

/**
 * 该单例可以被串行化
 */
public class SerSingleton implements Serializable {
    String name;

    private SerSingleton() {
        System.out.println("Singleton is created");
        name = "SerSingleton";
    }

    private static SerSingleton instaine = new SerSingleton();

    public static SerSingleton getInstance() {
        return instaine;
    }

    public static void createString() {
        System.out.println("createString in Singleton");
    }


    private Object readResolve(){
        return instaine;
    }

}

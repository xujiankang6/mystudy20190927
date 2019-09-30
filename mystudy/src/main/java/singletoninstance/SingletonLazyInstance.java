package singletoninstance;

/*
 *@create by jiankang
 *@date 2019/9/30 time 11:13
 */

public class SingletonLazyInstance {

    private SingletonLazyInstance() {
        System.out.println("lazyinstance is created");
    }

    private static SingletonLazyInstance instance = null;


    public static synchronized SingletonLazyInstance getInstance() {
        if (instance == null) {
            instance = new SingletonLazyInstance();
        }
        return instance;
    }


    public static void createString() {
        System.out.println("createString in Singleton");
    }
}

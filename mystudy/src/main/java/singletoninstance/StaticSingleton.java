package singletoninstance;

/*
 *@create by jiankang
 *@date 2019/9/30 time 11:24
 */

public class StaticSingleton {

    private StaticSingleton(){
        System.out.println("staticSingleton is create");
    }

    private static class SingletonHolder{
        private static StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return SingletonHolder.instance;
    }

}

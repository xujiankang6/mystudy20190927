package singletoninstance;

/*
 *@create by jiankang
 *@date 2019/9/30 time 11:17
 */

public class Test {

    public static void main(String[] args) {

        long singletonbegintime = System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            singletoninstance.Singleton.getInstance();
        }
        System.out.println("spend:"+(System.currentTimeMillis()-singletonbegintime));
        long singletonlazybegintime = System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            singletoninstance.SingletonLazyInstance.getInstance();
        }
        System.out.println("lazyspend:"+(System.currentTimeMillis()-singletonlazybegintime));

    }
}

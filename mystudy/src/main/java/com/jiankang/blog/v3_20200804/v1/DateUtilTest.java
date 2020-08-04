package com.jiankang.blog.v3_20200804.v1;

/*
 *@create by jiankang
 *@date 2020/8/4 time 9:34
 */

public class DateUtilTest {

/*
无状态：无状态方法的好处之一，就是它在各种环境下，都可以安全的调用。衡量一个方法是否是有状态的，就看它是否改动了其它的东西，
比如全局变量，比如实例的字段。format方法在运行过程中改动了SimpleDateFormat的calendar字段，所以，它是有状态的。
所以使用SimpleDateFormat是线程不安全的
注意：
    1、自己写公用类的时候，要对多线程调用情况的后果在注释里进行明确说明
    2、对线程环境下，每一个共享的可变变量都要注意其线程安全
    3、我们的类和方法在做设计时，要尽量设计成无状态的
 */
    public static class TestSimpleDateFormatThreadSafe extends  Thread{
        @Override
        public void run() {
            while (true){
                try {
                    this.join(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    System.out.println(this.getName()+":"+ DateUtil.parse("2013-05-24 06:02:20"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }



    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new TestSimpleDateFormatThreadSafe().start();
        }

    }
}

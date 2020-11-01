package com.jiankang.javaconcurrencybeauty.chapter6.v5;

/*
 *@create by jiankang
 *@date 2020/10/26 time 13:57
 */

import java.util.concurrent.locks.StampedLock;

public class Point {

    //成员变量
    private double x, y;

    //锁实例
    private final StampedLock sl = new StampedLock();

    //排他锁，写锁
    void move(double deltaX, double deltaY) {
        long stamp = sl.writeLock();
        try {
            x += deltaX;
            y += deltaY;
        } finally {
            sl.unlockWrite(stamp);
        }
    }

    //乐观读锁
    double distanceFromOrigin() {
        //1尝试获取乐观读锁
        long stamp = sl.tryOptimisticRead();
        //2将全部变量复制到方法体栈内
        double currentX = x, currentY = y;
        //3检查获取了读锁戳后，锁有没有被其他写线程排他性抢占
//        当获取到值时，有写锁修改，这里会变！false
        if (!sl.validate(stamp)) {

            //4如果被抢占则获取一个共享读锁（悲观获取）
            stamp = sl.readLock();
            try {
                //5将全部变量复制到方法体栈内
                currentX = x;
                currentY = y;
            } finally {
                //6释放共享读锁
                sl.unlockRead(stamp);
            }
        }

        return Math.sqrt(currentX * currentX + currentY * currentY);
    }

    //使用悲观锁获取读锁，并尝试转换为写锁
    void moveIfAtOrigin(double newX, double newY) {
        //1
        long stamp = sl.readLock();
        try {
            while (x == 0.0 && y == 0.0) {
                 //3尝试将获取的读锁升级为写锁
                 long ws = sl.tryConvertToWriteLock(stamp);
                 //4升级成功，则更新戳记，并设置坐标值，退出循环
                 if(ws!=0L){
                     stamp =ws;
                     x=newX;
                     y=newY;
                     break;
                 }else {
                     //5读锁升级写锁失败则释放读锁，显示获取独占写锁，然后循环重试
                     sl.unlockRead(stamp);
                     stamp=sl.writeLock();
                 }
            }
        }finally {
            //6释放锁
            sl.unlock(stamp);
        }
    }


}

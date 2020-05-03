package com.jiankang.javaprogramminglogic.chapter16.v2;

/*
 *@create by jiankang
 *@date 2020/5/3 time 11:45
 * 错误写法
 */

import java.util.Random;

public class AccountMgr {
    public static class NoEnoughMoneyException extends Exception {
    }


    public static void transfer(Account from, Account to, double money) throws NoEnoughMoneyException {
        boolean success = false;
        do {
            success = tryTransfer(from, to, money);
            if (!success) {
                Thread.yield();
            }
        } while (!success);
    }


    public static boolean tryTransfer(Account from, Account to, double money) throws NoEnoughMoneyException {

        if (from.tryLock()) {
            try {
                if (to.tryLock()) {
                    try {
                        if (from.getMoney() >= money) {
                            from.reduce(money);
                            to.add(money);
                        } else {
                            throw new NoEnoughMoneyException();
                        }
                        return true;
                    } finally {
                        to.unlock();
                    }
                }
            } finally {
                from.unlock();
            }
        }
        return false;
    }


    public static void simulateDeadLock() {
        final int accountNum = 10;
        final Account[] accounts = new Account[accountNum];
        final Random rnd = new Random();
        for (int i = 0; i < accountNum; i++) {
            accounts[i] = new Account(rnd.nextInt(10000));
        }
        int threadNum = 100;
        Thread[] threads = new Thread[threadNum];
        for (int i = 0; i < threadNum; i++) {
            threads[i] = new Thread() {
                @Override
                public void run() {
                    int loopNum = 100;
                    for (int k = 0; k < loopNum; k++) {
                        int i = rnd.nextInt(accountNum);
                        int j = rnd.nextInt(accountNum);
                        int money = rnd.nextInt(10);
                        if (i != j) {
                            try {
                                transfer(accounts[i], accounts[j], money);
                            } catch (AccountMgr.NoEnoughMoneyException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            };
            threads[i].start();
        }
    }
}

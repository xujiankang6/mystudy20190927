package com.jiankang.javacoretechnologythetenversion.chapter14.v5;

/*
 *@create by jiankang
 *@date 2020/6/29 time 9:21
 */

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private final double[] accounts;
    Lock lock =new ReentrantLock();
    private Condition sufficientMoney = lock.newCondition();

    public Bank(int n, double initialBalance) {
        this.accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }


    public void transfer(int from, int to, double amount) {
        lock.lock();
        try {
            while (accounts[from] < amount)
                sufficientMoney.await();
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf("Total Balance: %10.2f%n", getTotalBalance());
            sufficientMoney.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }




    }

    private double getTotalBalance() {
        double sum = 0;
        for (double account : accounts) {
            sum += account;
        }
        return sum;
    }


    public int size() {
        return accounts.length;
    }
}

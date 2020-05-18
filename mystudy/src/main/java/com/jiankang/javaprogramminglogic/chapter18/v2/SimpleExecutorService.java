package com.jiankang.javaprogramminglogic.chapter18.v2;

/*
 *@create by jiankang
 *@date 2020/5/11 time 20:46
 */

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

public class SimpleExecutorService extends AbstractExecutorService {
    @Override
    public void shutdown() {

    }

    @Override
    public List<Runnable> shutdownNow() {
        return null;
    }

    @Override
    public boolean isShutdown() {
        return false;
    }

    @Override
    public boolean isTerminated() {
        return false;
    }

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void execute(Runnable command) {

        new Thread(command).start();
    }

    public static void main(String[] args) {
        SimpleExecutorService simpleExecutorService = new SimpleExecutorService();
        simpleExecutorService.execute(new Thread());
    }
}
